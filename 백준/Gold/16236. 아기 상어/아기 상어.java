import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] board;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        int[] current = null;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 9) {
                    current = new int[]{i, j};
                    board[i][j] = 0;
                }
            }
        }

        int size = 2;
        int eat = 0; // 먹은 물고기수
        int move = 0; // 움직인 총 거리

        while (true) {
            PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) ->
                    o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
            );
            boolean[][] visit = new boolean[n][n];

            que.add(new int[]{current[0], current[1], 0});
            visit[current[0]][current[1]] = true;

            boolean check = false; // 상어가 먹이를 먹었는지 체크

            while(!que.isEmpty()) {
                current = que.poll();

                if (board[current[0]][current[1]] != 0 && board[current[0]][current[1]] < size) { // 먹이가 있으면서 상어의 사이즈보다 작다면?
                    board[current[0]][current[1]] = 0; // 물고기를 제거
                    eat++;
                    move += current[2]; // 움직인 거리를 총 움직인 거리에 추가
                    check = true; // 먹이 먹었다고 체크
                    break;
                }

                for (int k = 0; k < 4; k++) {
                    int ny = current[0] + dy[k];
                    int nx = current[1] + dx[k];

                    if (ny < 0 || nx < 0 || nx >= n || ny >= n || visit[ny][nx] || board[ny][nx] > size)
                        continue;

                    que.add(new int[]{ny, nx, current[2] + 1});
                    visit[ny][nx] = true;
                }
            }

            if (!check) // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
                break;

            if (size == eat) { // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
                size++;
                eat = 0;
            }
        }
        System.out.println(move);
    }
}
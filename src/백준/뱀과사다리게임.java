package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 16928번 뱀과 사다리 게임
class 뱀과사다리게임 {
    static int arr[] = new int[101];
    static int cnt[] = new int[101];
    static boolean visited[] = new boolean[101];

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 1번부터 시작
        visited[1] = true; // 한번 밟은 곳은 더이상 방문할 필요가 없다.

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == 100) {
                System.out.println(cnt[current]);
                return;
            }
            // 모든 주사위 이동 횟수만큼의 가능성을 다 본다.
            for (int i = 1; i <= 6; i++) {
                int next = current + i;
                if (next > 100) break;
                if (visited[next]) continue;

                // 사다리나 뱀이 있는 자리라면
                if (arr[next] != 0) {
                    if (!visited[arr[next]]) {
                        visited[arr[next]] = true;
                        cnt[arr[next]] = cnt[current] + 1;
                        queue.add(arr[next]);
                    }
                } else {
                    visited[next] = true;
                    cnt[next] = cnt[current] + 1;
                    queue.add(next);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine() + " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u] = v;
        }
        bfs();
    }
}
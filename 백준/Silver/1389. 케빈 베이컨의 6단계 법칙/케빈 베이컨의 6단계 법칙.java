import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Link {
    int x;
    int dist;

    Link(int x, int d) {
        this.x = x;
        this.dist = d;
    }
}

// 백준 16236번 아기상어
class Main {
    static int n, m;
    static int board[][] = new int[101][101];
    static boolean check[];
    static int res[] = new int[101];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = 1;
            board[y][x] = 1;
        }

        for (int i = 1; i <= n; i++) {
            check = new boolean[n + 1];
            bfs(i);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (res[i] < min) {
                min = res[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if (res[i] == min) {
                System.out.println(i);
                break;
            }
        }
    }

    //떨어진 거리를 체크하기 위해 Node 클래스를 만들었다
    //dist = 떨어진 거리
    //그래서 res 배열에 dist 만큼씩 더해주도록 만들어 보았다.
    public static void bfs(int v) {
        Queue<Link> queue = new LinkedList();
        check[v] = true;
        queue.offer(new Link(v, 0));

        while (!queue.isEmpty()) {
            int x = queue.peek().x;
            int dist = queue.poll().dist;
            for (int i = 1; i <= n; i++) {
                if (board[x][i] == 1 && !check[i]) {
                    queue.add(new Link(i, dist + 1));
                    check[i] = true;
                    res[i] += dist + 1;
                }
            }
        }
    }
}

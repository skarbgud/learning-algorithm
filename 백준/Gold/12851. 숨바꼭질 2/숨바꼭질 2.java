import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean check[] = new boolean[100001];
    static int cnt[] = new int[100001];
    static int dist[] = new int[100001];

    public static void bfs(int n, int k) {

        Queue<Integer> queue = new LinkedList();

        queue.add(n);
        check[n] = true;
        cnt[n] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int[] nextStep = {now - 1, now + 1, now * 2};
            for (int next : nextStep) {
                if (next >= 0 && next <= 100000) {
                    if (!check[next]) {
                        check[next] = true;
                        dist[next] = dist[now] + 1;
                        queue.add(next);
                        cnt[next] = cnt[now];
                    } else if (dist[next] == dist[now] + 1) {
                        cnt[next] += cnt[now];
                    }
                }
            }
        }
        System.out.println(dist[k]);
        System.out.println(cnt[k]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bfs(n, k);
    }
}
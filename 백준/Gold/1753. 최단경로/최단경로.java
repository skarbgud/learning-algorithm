import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparable<Node> {

    public int index;
    public int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        if (this.distance < o.distance) {
            return -1;
        }
        return 1;
    }
}

// 백준 1753번 최단경로
class Main {

    static final int INF = Integer.MAX_VALUE;
    static int v, e, k;
    static List<List<Node>> graph = new ArrayList<>();
    static int[] d = new int[20001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }

        Arrays.fill(d, INF);

        dijkstra(k);

        for (int i = 1; i <= v; i++) {
            if (d[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(d[i]);
            }
        }

    }

    public static void dijkstra(int start) {
        Queue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0));
        d[start] = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int dist = node.distance;
            int now = node.index;
            if (d[now] < dist) continue;
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).distance;
                if (cost < d[graph.get(now).get(i).index]) {
                    d[graph.get(now).get(i).index] = cost;
                    queue.offer(new Node(graph.get(now).get(i).index, cost));
                }
            }
        }
    }
}
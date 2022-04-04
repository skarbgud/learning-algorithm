package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 백준 7662번 이중 우선순위 큐
class 이중우선순위큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int k = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> minQueue = new PriorityQueue<>();
            PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < k; i++) {
                String[] input = br.readLine().split(" ");
                char ch = input[0].charAt(0);
                int n = Integer.parseInt(input[1]);

                if (ch == 'I') {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                    minQueue.add(n);
                    maxQueue.add(n);
                } else {
                    if (map.size() == 0) {
                        continue;
                    }
                    PriorityQueue<Integer> queue = n == 1 ? maxQueue : minQueue;
                    removeMap(queue, map);
                }
            }

            if (map.size() == 0) {
                System.out.println("EMPTY");
            } else {
                int n = removeMap(maxQueue, map);
                System.out.println(n + " " + (map.size() > 0 ? removeMap(minQueue, map) : n));
            }
        }

    }

    private static int removeMap(PriorityQueue<Integer> queue, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = queue.poll();
            int cnt = map.getOrDefault(num, 0);
            if (cnt == 0) {
                continue;
            }
            if (cnt == 1) {
                map.remove(num);
            } else {
                map.put(num, cnt - 1);
            }
            break;
        }
        return num;
    }
}
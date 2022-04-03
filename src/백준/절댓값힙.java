package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 백준 2630번 절댓값 힙
class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            // 절대값이 같으면 기존의 방식으로 오름차순 정렬 아니라면 절대값 기준으로 오름차순 정렬
            return Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2));
        });

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                System.out.println(priorityQueue.size() == 0 ? 0 : priorityQueue.poll());
            } else {
                priorityQueue.add(x);
            }
        }
    }
}

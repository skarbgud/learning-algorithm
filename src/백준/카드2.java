package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 백준 2164번 카드2
class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1 ) {
            // 제일 위의 카드 바닥에 버리기
            queue.poll();
            // 다음 위에 카드를 제일 아래 카드 밑으로 옮기기
            int temp = queue.poll();
            queue.offer(temp);
        }
        // 맨 마지막에 남아있는 카드
        System.out.print(queue.poll());
    }
}

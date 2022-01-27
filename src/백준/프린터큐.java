package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 백준 1966번 프린터 큐
class 프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine() + " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                // {초기위치, 중요도}
                queue.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            // 출력 횟수
            int count = 0;
            while (!queue.isEmpty()) {
                // 가장 첫 원소
                int[] first = queue.poll();
                boolean max = true;

                for (int i = 0; i < queue.size(); i++) {
                    // 첫원소의 중요도보다 큐에 있는 i번째 원소의 중요도가 클 경우
                    if (first[1] < queue.get(i)[1]) {
                        // 뽑은 원소를 뒤에 집어넣고
                        queue.offer(first);
                        // 0부터 i번째 까지 뽑아서 뒤로 보낸다
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        // 가장 큰 원소가 아니므로 false 하고 탐색 마침
                        max = false;
                        break;
                    }
                }
                // 첫번째 원소가 가장 큰 원소가 아니였으니까 다음 반복문으로 시작함
                if (max == false) {
                    continue;
                }
                // first가 가장 큰 원소가 되는 것으로 count를 증가
                count++;
                // 찾고자하는 원소와 같다면 종료
                if (first[0] == m) {
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
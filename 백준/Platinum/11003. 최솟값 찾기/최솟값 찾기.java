import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<int[]> q = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (!q.isEmpty() && q.peekLast()[0] > num) { // 뒤에서 꺼낸게 num보다 큰게 있다면 다 꺼낸다
                q.pollLast();
            }

            q.offer(new int[]{num, i}); //숫자에 인데스 매겨서 dequeue에 삽입
            if (q.peek()[1] < i - (l - 1)) { //현재 최소값 인덱스가 l에 벗어나면 삭제
                q.pollFirst();
            }
            sb.append(q.peek()[0]).append(" ");
        }
        System.out.print(sb);
    }
}
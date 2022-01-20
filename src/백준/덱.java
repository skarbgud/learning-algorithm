package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 백준 10866번 덱
class 덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push_front":
                    dequeue.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dequeue.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.pollFirst()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case "pop_back":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.pollLast()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case "size":
                    sb.append(dequeue.size()).append('\n');
                    break;
                case "empty":
                    if (dequeue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.peekFirst()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case "back":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.peekLast()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}

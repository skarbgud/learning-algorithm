package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 18258번 큐2
class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer command;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            command = new StringTokenizer(br.readLine());

            switch (command.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.pop()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    Integer first = queue.peekFirst();
                    if (first == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(first).append('\n');
                    }
                    break;
                case "back":
                    Integer last = queue.peekLast();
                    if (last == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(last).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}
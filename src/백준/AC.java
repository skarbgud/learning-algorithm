package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 5430번 AC
class AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            ArrayDeque<Integer> arr = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            String function = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String testCase = br.readLine().replace("[", "").replace("]", "");
            StringTokenizer st = new StringTokenizer(testCase, ",");
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            boolean error = false;
            boolean reverse = false;
            for (char f : function.toCharArray()) {
                if (f == 'R') {
                    reverse = !reverse;
                } else {
                    if (arr.size() == 0) {
                        error = true;
                        break;
                    } else {
                        if (reverse) {
                            arr.removeLast();
                        } else {
                            arr.removeFirst();
                        }
                    }
                }
            }
            if (error) {
                sb.append("error").append('\n');
                System.out.println("error");
            } else {
                sb.append('[');
                if (reverse) {
                    for (int c = arr.size() - 1; c >= 0; c--) {
                        if (c == 0) {
                            sb.append(arr.pollLast());
                        } else {
                            sb.append(arr.pollLast()).append(',');
                        }
                    }
                } else {
                    for (int x : arr) {
                        if (arr.size() == 1) {
                            sb.append(arr.pollFirst());
                        } else {
                            sb.append(arr.pollFirst()).append(',');
                        }
                    }
                }
                sb.append(']');
                System.out.println(sb);
            }
        }
        br.close();
    }
}
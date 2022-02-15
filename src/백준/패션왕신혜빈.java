package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 백준 9375번 패션왕신혜빈
class 패션왕신혜빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            HashMap<String, Integer> map = new HashMap<>(); // <종류, 개수>

            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine() + " ");
                st.nextToken();
                String kind = st.nextToken();

                // 옷 종류를 해시맵에 담는다
                if (map.containsKey(kind)) {
                    map.put(kind, map.get(kind) + 1);
                } else {
                    map.put(kind, 1);
                }
            }
            int answser = 1;

            // 안입는 경우를 고려해 각 종류의 옷의 개수에 +1 해준 값을 곱한다
            for (int x : map.values()) {
                answser *= (x + 1);
            }
            // 알몸인 상태 제외 answer에 -1
            sb.append(answser - 1).append('\n');
        }
        System.out.println(sb);
    }
}
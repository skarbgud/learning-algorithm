package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 백준 17219번 비밀번호 찾기
class 비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() + " ");
            map.put(st.nextToken().toString(), st.nextToken().toString());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String site = br.readLine();
            sb.append(map.get(site)).append('\n');
        }
        System.out.println(sb);
    }
}
package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 1764번 듣보잡
class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n + m; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        List<String> arr = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                cnt++;
                arr.add(key);
            }
        }
        Collections.sort(arr);
        for (String a : arr) {
            sb.append(a).append('\n');
        }
        System.out.println(cnt);
        System.out.print(sb);
    }
}
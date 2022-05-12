package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 백준 14425번 문자열 집합
class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> n_s = new ArrayList<>();
        List<String> m_s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            n_s.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            m_s.add(br.readLine());
        }

        int cnt = 0;

        for (String s : m_s) {
            if (n_s.contains(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
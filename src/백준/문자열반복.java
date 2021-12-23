package 백준;

import java.io.*;

// 백준 2675번 문자열 반복
class 문자열반복 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);

            for (char x : str[1].toCharArray()) {
                for (int j = 0; j < R; j++) {
                    sb.append(x);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

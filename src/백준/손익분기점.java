package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1712번 손익분기점
class 손익분기점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        br.close();

        while (st.hasMoreTokens()) {
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (C <= B) {
                System.out.println("-1");
            } else {
                System.out.println((A / (C - B)) + 1);
            }
        }
    }
}

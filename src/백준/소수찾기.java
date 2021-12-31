package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1978번 소수찾기
class 소수찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        while (st.hasMoreTokens()) {
            if (isSosu(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isSosu(int n) {
        boolean jugement = true;
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return jugement;
    }
}
package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2908번 상수
class 상수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        br.close();

        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();
        String numA = "";
        String numB = "";

        for (int i = A.length - 1; i >= 0; i--) {
            numA = numA.concat(String.valueOf(A[i]));
            numB = numB.concat(String.valueOf(B[i]));
        }

        System.out.println((Integer.parseInt(numA) > Integer.parseInt(numB) ? numA : numB));
    }
}
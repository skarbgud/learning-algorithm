package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

// 백준 2935번 소음
class 소음 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal A = new BigDecimal(br.readLine());
        String operator = br.readLine();
        BigDecimal B = new BigDecimal(br.readLine());
        br.close();
        if (operator.equals("+")) {

            System.out.println(A.add(B));
        } else {
            System.out.println(A.multiply(B));
        }
    }
}
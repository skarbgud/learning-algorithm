package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11654번 아스키 코드
class 아스키코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = br.readLine().charAt(0);
        br.close();

        int num = (int) ch;

        System.out.println(num);
    }
}

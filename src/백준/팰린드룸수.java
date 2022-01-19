package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1259번 팰린드롬수
class 팰린드룸수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            System.out.println(isReverseNum(n));
        }
    }

    public static String isReverseNum(String n) {
        String answer = "yes";

        char[] arr = n.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == arr[arr.length - i - 1])) {
                return "no";
            }
        }

        return answer;
    }
}
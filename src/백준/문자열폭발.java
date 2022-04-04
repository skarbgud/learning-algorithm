package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 백준 9935번 문자열 폭발
class 문자열폭발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (sb.length() < bomb.length()) {
                continue;
            }
            if (bomb.equals(sb.substring(sb.length() - bomb.length(), sb.length()))) {
                sb.delete(sb.length() - bomb.length(), sb.length());
            }
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
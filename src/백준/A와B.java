package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 12904번 A와 B
class A와B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder s = new StringBuilder(br.readLine());
        StringBuilder t = new StringBuilder(br.readLine());

        while (t.length() > s.length()) {
            if (t.charAt(t.length()-1) == 'A') {
                t = t.replace(t.length()-1, t.length(), "");
            } else if (t.charAt(t.length()-1) == 'B') {
                t = t.replace(t.length()-1, t.length(), "");
                t = t.reverse();
            }
        }

        if (t.toString().equals(s.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
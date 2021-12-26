package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2941번 크로아티아 알파벳
class 크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            // ch기 c인 경우
            if (ch == 'c' && i < length - 1) {
                // 다음 문자가 '=' 또는 '-' 인 경우
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    // i+1 까지 하나의 문자이므로 다음 문자로 건너뛰기
                    i++;
                }
            }
            // ch가 d인 경우
            else if (ch == 'd' && i < length - 1) {
                //  'd-' 인 경우
                if (str.charAt(i + 1) == '-') {
                    i++;
                }
                // 'dz=' 인 경우
                else if (str.charAt(i + 1) == 'z' && i < length - 2) {
                    if (str.charAt(i+2) == '=')
                    i += 2;
                }
            }
            // ch가 l과 n인 경우
            else if ((ch == 'l' || ch == 'n') && i < length - 1) {
                // 'lj' 또는 'nj' 인 경우
                if (str.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            // ch가 s과 z인 경우
            else if ((ch == 's' || ch == 'z') && i < length - 1) {
                // 's=' 또는 'z=' 인 경우
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}
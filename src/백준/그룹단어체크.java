package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1316번 그룹 단어 체크
class 그룹단어체크 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (check()) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            // 앞에 문자와 i번째 문자가 같지 않다면
            if (prev != now) {
                // 해당 문자가 처음 나온 경우
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true; // true로 바꿔준다.
                    prev = now; // 다음 비교를 위해 이전값에 now 값을 넣는다.
                }
                // 해당 문자가 이미 나온적 있는 경우
                else {
                    return false; //함수 종료
                }
            }
            // 앞 문자와 i번째 문자와 같다면 (==>연속문자)
            else {
                continue;
            }
        }
        return true;
    }
}

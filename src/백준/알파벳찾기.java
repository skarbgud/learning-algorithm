package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 10809번 알파벳 찾기
public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        br.close();

        // 수행시간 O(n)
        // 알파벳 a-z까지를 indexOf()로 찾아내서 인덱스 반환
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(word.indexOf(c) + " ");
        }
    }
}
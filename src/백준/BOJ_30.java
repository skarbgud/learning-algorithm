package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 백준 10610번 30
class BOJ_30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        long sum = 0;
        int[] numCount = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(str.substring(i, i + 1));
            numCount[num]++;
            sum += num;
        }

        if (!str.contains("0") || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (numCount[i] > 0) {
                sb.append(i);
                numCount[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}
package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2920번 음계
class 음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < 8; i++) {
            int x = arr[i];
            int y = arr[i - 1];
            if (x < y) {
                ascending = false;
            } else if (x > y) {
                descending = false;
            }
        }
        if (ascending) System.out.println("ascending");
        else if (descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
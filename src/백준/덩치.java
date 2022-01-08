package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 7568번 덩치
class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() + " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
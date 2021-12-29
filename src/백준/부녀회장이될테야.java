package 백준;

import java.util.Scanner;

// 백준 2775번 부녀회장이될테야
class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 아파트 생성
        int[][] APT = new int[15][15];

        for (int i = 0; i < 15; i++) {
            // 1호는 1로 초기화
            APT[i][1] = 1; // i층 1호
            // 0층은 i로 초기화
            APT[0][i] = i; // 1층 i호
        }

        for (int i = 1; i < 15; i++) { // 1층 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(APT[k][n]);
        }
    }
}
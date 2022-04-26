package 백준;

import java.util.Scanner;

// 백준 9663번 N-Queen
class NQueen {
    static int[] arr;
    static int n;
    static int count = 0;

    private static void nQueen(int depth) {
        if (depth == n) {
            count++;
            return;
        } else {
            for (int i = 0; i < n; i++) {
                arr[depth] = i;
                if (posibility(depth)) {
                    nQueen(depth + 1);
                }
            }
        }
    }

    private static boolean posibility(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        nQueen(0);
        System.out.println(count);
    }
}
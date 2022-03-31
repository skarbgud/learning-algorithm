package 백준;

import java.util.Arrays;
import java.util.Scanner;

// 백준 11399번 ATM
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += prev + arr[i];
            prev += arr[i];
        }
        System.out.println(sum);
    }
}
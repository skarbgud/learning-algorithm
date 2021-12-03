package 백준;

import java.util.Arrays;
import java.util.Scanner;

// 백준 10818번 최소최대
class 최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}

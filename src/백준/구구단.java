package 백준;

import java.util.Scanner;

// 백준 2739번 구구단
class 구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }

    }
}

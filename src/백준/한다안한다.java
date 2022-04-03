package 백준;

import java.util.Scanner;

// 백준 5789번 한다 안한다
class 한다안한다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            char str[] = sc.next().toCharArray();
            if (str[str.length / 2 - 1] == str[str.length / 2]) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
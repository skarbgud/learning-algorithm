package 백준;

import java.util.Scanner;

// 백준 9498번 숫자의 개수
class 시험성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 90 && num <= 100)
        {
            System.out.println("A");
        }
        else if (num >= 80 && num < 90)
        {
            System.out.println("B");
        }
        else if (num >= 70 && num < 80)
        {
            System.out.println("C");
        }
        else if (num >= 60 && num < 70)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}

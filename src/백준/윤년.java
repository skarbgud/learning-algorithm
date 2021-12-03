package 백준;

import java.util.Scanner;

// 백준 2735번 윤년
class 윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(leapYear(sc.nextInt()));
        sc.close();
    }

    public static int leapYear(int num)
    {
        int answer = ((num % 4 == 0) && !(num % 100 == 0) || (num % 400 == 0)) ? 1 : 0;

        return answer;
    }
}

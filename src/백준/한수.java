package 백준;

import java.util.Scanner;

// 백준 10989번 한수
class 한수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(arithmetic_equence(sc.nextInt()));
        sc.close();
    }

    public static int arithmetic_equence(int num)
    {
        int cnt = 0; // 한수 카운팅

        if (num < 100)
        {
            return num;
        }

        else {
            cnt = 99;
            if (num == 1000)
            {
                num = 999;
            }

            for (int i = 100; i <= num; i++)
            {
                int hun = i / 100; // 백의 자리 수
                int ten = (i /10) % 10; // 십의 자리 수
                int one = i % 10; // 일의 자리 수

                if ((hun- ten) == (ten-one)) // 각 자리수가 수열을 이루면
                {
                   cnt++;
                }
            }
        }

        return cnt;
    }
}

package 백준;

import java.io.IOException;
import java.util.Scanner;

// 백준 10872번 팩토리얼
class 팩토리얼 {
    public static void main(String[] args) throws IOException {

        팩토리얼 T = new 팩토리얼();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(T.recursion(n));

        sc.close();
    }

    public int recursion(int n)
    {
        // 재귀 종료 조건
        if (n <= 1) 
        {
            return 1;
        }
        return n * recursion(n-1);
    }
}

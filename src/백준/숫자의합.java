package 백준;

import java.io.IOException;
import java.util.Scanner;

// 백준 11720번 숫자의합
class 숫자의합 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr = sc.next();

        int sum = 0;

        for (char x : arr.toCharArray())
        {
            int convertValue = Integer.parseInt(String.valueOf(x));
            sum += convertValue;
        }

        System.out.println(sum);

        sc.close();
    }
}

package 백준;

import java.util.HashMap;
import java.util.Scanner;

// 백준 2577번 숫자의 개수
class 숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A*B*C;

        String mulString = String.valueOf(mul);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < mulString.length(); i++)
        {
            int x = Character.getNumericValue(mulString.toCharArray()[i]);
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(map.getOrDefault(i, 0));
        }
    }
}

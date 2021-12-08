package 백준;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 백준 3460번 이진수
class 이진수 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            String binary = Integer.toBinaryString(n);
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < binary.length(); j++) {
                list.add(Integer.parseInt(binary.substring(j, j + 1)));
            }

            Collections.reverse(list);

            for (int k = 0; k < list.size(); k++) {
                if (list.get(k) == 1) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

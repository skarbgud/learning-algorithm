package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2562번 최대값
class 최대값 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i])
            {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);

    }
}
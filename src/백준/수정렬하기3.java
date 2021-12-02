package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 10989번 수 정렬하기 3
class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

         Arrays.sort(arr);

        for (int j = 0; j < arr.length; j++)
        {
            sb.append(arr[j]).append("\n");
        }

        System.out.println(sb);
    }
}

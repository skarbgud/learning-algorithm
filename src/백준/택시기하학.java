package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 3053번 택시 기하학
class 택시기하학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine()); // 반지름 R
        br.close();

        System.out.println(R * R * Math.PI); // 유클리드 원의 넓이
        System.out.println(2 * R * R); // 택시 기하학 원의 넓이
    }
}
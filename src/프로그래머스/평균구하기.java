package 프로그래머스;

import java.util.Arrays;

public class 평균구하기 {

    public static void main(String[] args) {
        평균구하기 s = new 평균구하기();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}));
    }

    public double solution(int[] arr) {
        double answer = 0;
        int sum = Arrays.stream(arr).sum();
        answer = (double) sum / arr.length;

        return answer;
    }
}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 2108번 통계학
class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        // sb.append(Math.round((double) sum / n));
        System.out.println(Math.round((double) sum / n));

        Arrays.sort(arr);
        System.out.println(arr[n / 2]);

        System.out.println(frequency(arr));

        System.out.println((arr[n - 1] - arr[0]));
    }

    public static int frequency(int[] arr) {
        int[] freq = new int[8001]; // -4000 ~ 4000 사이 값
        for (int i : arr) {
            freq[i + 4000]++; // 빈도수 입력
        }

        // 최대 빈도값
        int maxFrequency = Integer.MIN_VALUE;
        // 최대 빈도값을 가진 인덱스
        int maxIndex = 0;
        // 최대값 넣기
        for (int i = 0; i < 8001; i++) {
            if (freq[i] > maxFrequency) {
                maxFrequency = freq[i];
            }
        }
        // 두번째인지 구별할 키값
        boolean twice = false;
        for (int i = 0; i < 8001; i++) {
            // 최빈값일경우
            if (freq[i] == maxFrequency) {
                if (twice) {
                    maxIndex = i - 4000;
                    break;
                }
                maxIndex = i - 4000;
                twice = true; // 플래그 체크
            }
        }

        return maxIndex;
    }
}
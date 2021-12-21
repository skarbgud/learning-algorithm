
package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 4344번 평균은 넘겠지
class 평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;

        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < c; i++) {

            st = new StringTokenizer(br.readLine() + " ");

            int person = Integer.parseInt(st.nextToken());

            // 학생 성적 누적합
            double sum = 0;

            //  학생 수 만큼 배열 생성
            arr = new int[person];

            for (int j = 0; j < person; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[j] = value;
                sum += value;
            }

            double mean = (sum / person);
            double cnt = 0;

            for (int j = 0; j < person; j++) {
                if (arr[j] > mean) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt / person) * 100);
        }
    }
}
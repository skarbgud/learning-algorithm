package 백준;

import java.io.IOException;
import java.util.Scanner;

// 백준 1193번 분수찾기
class 분수찾기 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int crossCount = 1, prevCountSum = 0;

        while (true) {
            // 직선 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (x <= prevCountSum + crossCount) {
                // 대각선의 개수가 홀수 이면 분모가 큰수부터 시작
                if (crossCount % 2 == 1) {
                    // 분자는 x번째 - 직전대각선의 누적합
                    // 분모는 대각선의 개수 - (x번째 - 직전 대각선의 누적합 -1)
                    System.out.print((crossCount - (x - prevCountSum - 1)) + "/" + (x - prevCountSum));
                    break;
                }
                // 대각선의 개수가 짝수일 경우
                else {
                    // 홀수일때 출력 반대로
                    System.out.print((x - prevCountSum) + "/" + (crossCount - (x - prevCountSum - 1)));
                    break;
                }
            }
            else
            {
                prevCountSum += crossCount;
                crossCount++;
            }
        }

        sc.close();
    }
}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 11650번 좌표 정렬하기
class 좌표정렬하기 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine() + " ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, (e1, e2) -> {
      return e1[0] == e2[0] ? e1[1] - e2[1] : e1[0] - e2[0];
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
    }
    System.out.println(sb);
  }
}

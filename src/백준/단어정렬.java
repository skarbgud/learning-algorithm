package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 백준 1181번 단어 정렬
class 단어정렬 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[] arr = new String[n];

    for (int i = 0; i < n; i++) {
      arr[i] = br.readLine();
    }

    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        // 단어의 길이가 같은 경우
        if (s1.length() == s2.length()) {
          return s1.compareTo(s2); // 사전 순 정렬 a,b,c...z
        }
        // 길이가 같지 않을 경우에는 단어의 길이로 비교
        // 음수에 경우 안바뀌고 양수에 경우 바뀐다
        // [오름차순] 첫번째 인자 - 두번째 인자, [내림차순] 두번째 인자 - 첫번째 인자
        else {
          return s1.length() - s2.length();
        }
      }
    });

    StringBuilder sb = new StringBuilder();
    // 첫단어는 비교를 위해 기본값으로 넣는다
    sb.append(arr[0]).append('\n');
    // 중복되지 않는 단어만 출력 - 정렬에서 앞단어와 비교
    for (int i = 1; i < n; i++) {
      if (!arr[i].equals(arr[i - 1])) {
        sb.append(arr[i]).append('\n');
      }
    }

    System.out.println(sb);
  }
}

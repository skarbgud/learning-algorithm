package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1759번 암호만들기
class 암호만들기 {

  static int L;
  static int C;
  static char[] arr;

  private static String dfs(int index, String str) {
    if (str.length() == L && isInvalid(str)) {
      System.out.println(str);
      return str;
    }

    // C보다 index가 크거나 같을때 끝
    if (C <= index) {
      return str;
    }
    
    // 인덱스 늘리고 현재 인덱스 문자 추가 
    dfs(index+1, str + arr[index]);

    // 인덱스 포함 x
    dfs(index+1, str);

    return str;
  }
  
  // 모음 1개 이상, 자음 2개 이상 포함 확인
  private static boolean isInvalid(String str) {
    // 해당 모음 포함 한다면
    if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") | str.contains("u")) {
      str = str.replace("a", "");
			str = str.replace("e", "");
			str = str.replace("i", "");
			str = str.replace("o", "");
			str = str.replace("u", "");
			if (str.length() >= 2) {
				return true;
			}
    }

    return false;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    L = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    arr = new char[C];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < C; i++) {
      arr[i] = st.nextToken().charAt(0);
    }

    Arrays.sort(arr);
    dfs(0, "");
  }
}
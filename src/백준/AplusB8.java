package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11022번 A+B - 8
class AplusB8 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    for (int i = 1; i <= n; i++)
    {
      st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      sb.append("Case #").append(i).append(": ")
      .append(A).append(" + ")
      .append(B).append(" = ")
      .append(A+B).append("\n");
    }
    br.close();
    System.out.println(sb);
  }
}
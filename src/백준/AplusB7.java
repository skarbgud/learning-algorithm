package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11021번 A+B - 7
class AplusB7 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    for (int i = 1; i <= n; i++)
    {
      st = new StringTokenizer(br.readLine(), " ");
      sb.append("Case #").append(i).append(": ").append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
    }
    br.close();
    System.out.println(sb);
  }
}
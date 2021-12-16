package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 10871번 X보다작은수
class X보다작은수 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine() + " ");
    
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine() + " ");

    br.close();

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++)
    {
      
      int a = Integer.parseInt(st.nextToken());
      if (a < x)
      {

        sb.append(a).append(" ");
      }
    }
    System.out.print(sb);
    
  }
}
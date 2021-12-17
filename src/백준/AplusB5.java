package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 10952번 A + B - 5
class AplusB5 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st;

    while(true)
    {
      st = new StringTokenizer(br.readLine() + " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      
      if (A == 0 && B == 0) {
        break;
      }
      else {
        sb.append(A+B).append("\n");
      }
    }
    br.close();
    System.out.print(sb);
    
  }
}
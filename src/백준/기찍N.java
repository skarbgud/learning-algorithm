package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 백준 2742번 기찍N
class 기찍N {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());

    for (int i = n; i > 0; i--)
    {
      bw.write(i + "\n");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}




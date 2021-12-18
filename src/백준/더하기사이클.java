package 백준;

import java.util.Scanner;

// 백준 1110번 더하기사이클
class 더하기사이클 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.close();

    int cnt = 0;
    int copy = n;

    while (true)
    {
      n = ((n % 10) * 10) + (((n/10) + (n % 10)) % 10);
      cnt++;
      if (n == copy)
      {
        break;
      }
    }

    System.out.println(cnt);

  }
}
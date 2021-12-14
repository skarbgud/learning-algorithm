package 백준;

import java.util.Scanner;

// 백준 8393번 합
class 합 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int sum = 0;

    for (int i = 1; i <= n; i++)
    {
      sum+=i;
    }
    System.out.print(sum);

    sc.close();
  }
}




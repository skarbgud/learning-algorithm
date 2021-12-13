package 백준;

import java.util.Scanner;

// 백준 10950번 A+B - 3
class APlusB3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    
    for (int i = 0; i < Integer.parseInt(n); i++)
    {
      int A = sc.nextInt();
      int B = sc.nextInt();
      System.out.println(A+B);
    }
  }
}




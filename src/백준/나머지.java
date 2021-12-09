package 백준;

import java.util.Scanner;

// 백준 10430번 나머지
class 나머지 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String B = sc.nextLine();
    
    System.out.println(Integer.parseInt(A) * Integer.parseInt(String.valueOf(B.charAt(2))));
    System.out.println(Integer.parseInt(A) * Integer.parseInt(String.valueOf(B.charAt(1))));
    System.out.println(Integer.parseInt(A) * Integer.parseInt(String.valueOf(B.charAt(0))));
    System.out.println(Integer.parseInt(A) * Integer.parseInt(B));

    sc.close();
  }
}




package 백준;

import java.util.Scanner;

// 백준 14681번 사분면 고르기
class 사분면고르기 {
  public static void main(String[] args){

    사분면고르기 T = new 사분면고르기();

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    if (x > 0 && y >0) {
      System.out.print('1');
    } else if (x < 0 && y >0) {
      System.out.print('2');
    } else if (x < 0 && y < 0) {
      System.out.print('3');
    } else if (x > 0 && y < 0) {
      System.out.print('4');
    }
  }
}
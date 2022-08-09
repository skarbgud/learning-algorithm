
import java.util.Scanner;

// 백준 2884번 알람시계
class Main {
  public static void main(String[] args){

    Main T = new Main();

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int M= sc.nextInt();

    M -= 45;

    if (M < 0)
    {
      H -=1; 
      M = 60 +  M;
    }
    if (H < 0)
    {
      H = 24 + H;
    }
    
    System.out.println(H + " " + M);
  }
}
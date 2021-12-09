package 백준;

import java.util.Scanner;

// 백준 2798번 블랙잭
class 블랙잭 {

  public int solution(int n, int m, int[] arr)
  {
    int answer = 0;

    for (int i = 0; i < n - 2; i++)
    {
      for (int j = i + 1; j < n -1; j++)
      {
        for (int k = j + 1; k < n; k++)
        {
          // 3개의 카드 합의 변수 sum
          int sum = arr[i] + arr[j] + arr[k];

          if (sum == m)
          {
            // 합이랑 같다면 리턴
            return sum;
          }

          // 세 카드의 합이 이전값 보다 크면서 M보다 작으면 순회
          if (answer < sum && sum < m)
          {
            answer = sum;
          }
        }
      }
    }
    
    return answer;
  }
  public static void main(String[] args){

    블랙잭 T = new 블랙잭();

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    
    System.out.println(T.solution(n, m , arr));
  }
}
package 백준;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1920번 수 찾기
class 수찾기 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int [] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }

    // 오름차순 정렬
    Arrays.sort(arr);
    
    int m = sc.nextInt();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++)
    {
      if (halfSearch(arr, sc.nextInt()))
      {
        sb.append(1).append('\n');
      }
      else 
      {
        sb.append(0).append('\n');
      }
    }
    System.out.print(sb);

    sc.close();
  }

  public static boolean halfSearch(int[] arr, int key)
  {
    
    boolean hasNum = false;
    int lt = 0, rt = arr.length - 1;

    while(lt <= rt)
    {
      int mid = (lt + rt) / 2;
      if (arr[mid] > key) 
      {
        rt = mid - 1;
      }
      else if (arr[mid] < key)
      {
        lt = mid + 1;
      }
      else
      {
        hasNum = true;
        break;
      }
    }

    return hasNum;
  }
  
}




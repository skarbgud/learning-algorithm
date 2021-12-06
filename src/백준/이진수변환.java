package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 백준 10829번 이진수 변환
class 이진수변환 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long inputNum = Long.parseLong(br.readLine());
        ArrayList<Long> numArrList = new ArrayList<>();

        // inputNum이 0보다 클때까지 반복
        while (inputNum > 0)
        {
          // num은 나머지
          long num = inputNum % 2;
          // inputNum은 2로 나눈값
          inputNum /= 2;
          // 이진수의 값인 나머지는 ArrayList에 넣기
          numArrList.add(num);
        }
        
        // 리스트 순서 뒤집기
        Collections.reverse(numArrList);

        for (long num : numArrList)
        {
          System.out.print(num);
        }
    }
}

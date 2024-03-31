import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);     //오름차순 정렬하기
        
        int startIndex = 0;   //시작점
        int endIndex = n - 1; //끝점
        int cnt = 0;          //완성되는 갑옷의 개수
        while (startIndex < endIndex) { //두 점이 교차되서 넘어가지 않을때까지
            if (m < arr[startIndex] + arr[endIndex]) {          //큰 번호 재료를 한칸 아래로 변경
                endIndex--;
            } else if (m > arr[startIndex] + arr[endIndex]) {   //작은 번호 재료를 한칸 위로 변경
                startIndex++;
            } else {    //경우의 수 증가, 양쪽 index 각각 변경
                cnt++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(cnt);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 1; // 자기자신이 default로 뽑히는 경우
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while (endIndex != n) { //endIndex가 끝까지 갈때 까지
            if (sum == n) {         // 현재 연속 합이 N과 같을 경우
                count++;            // 합인경우
                endIndex++;         // 끝점을 칸을 한칸 올린다.
                sum += endIndex;    // 올린 끝점만큼 더한다.
            } else if (sum > n) {   // 현재 연속 합이 N보다 큰 경우
                sum -= startIndex;  // 현재시작점만큼 빼고
                startIndex++;       // 시작점을 한칸 올린다.
            } else {                // 현재 연속 합이 N보다 작은 경우
                endIndex++;         // 끝점을 한칸올리고
                sum += endIndex;    // 올린만큼 더한다.
            }
        }
        System.out.println(count);
    }
}
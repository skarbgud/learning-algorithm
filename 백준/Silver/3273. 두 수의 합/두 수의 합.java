import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 3273번 두 수의 합
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0, end = n - 1, cnt = 0, sum = 0;
        
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == x) cnt++;
            if (sum <= x) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(cnt);
    }
}
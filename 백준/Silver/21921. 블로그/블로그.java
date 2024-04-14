import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }
        int max = sum;
        int cnt = 1;
        for (int i = x; i < n; i++) {
            sum = sum + arr[i] - arr[i - x];
            if (sum > max) {
                max = sum;
                cnt = 1;
            } else if (sum == max) {
                cnt++;
            }
        }

        System.out.println(max == 0 ? "SAD" : max + "\n" + cnt);
    }
}
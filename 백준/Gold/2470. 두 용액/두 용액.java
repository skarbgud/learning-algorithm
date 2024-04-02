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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];
        while (i < j) {
            int sum = Math.abs(arr[i] + arr[j]);
            if (sum < min) {
                min = sum;
                answer = new int[]{arr[i], arr[j]};
            }
            if (arr[i] + arr[j] > 0) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}
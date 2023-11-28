import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Float topRate = (float) (n * 0.15);
        int top = Math.round(topRate);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        int cnt = 0;
        for (int i = top; i < n - top; i++) {
            sum += arr[i];
            cnt++;
        }
        int result = (int)Math.round((double) sum / cnt);
        System.out.println(result);
    }
}
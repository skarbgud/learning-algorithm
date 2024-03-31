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

        int cnt = 0;
        for (int k = 0; k < n; k++) {
            int kind = arr[k];
            int i = 0;
            int j = n - 1;
            while (i < j) {
                if (arr[i] + arr[j] == kind) {
                    // 서로 다른 두수의 합이여야만한다.
                    if (i != k && j != k) {
                        cnt++; // 해당수가 좋은수라는것 찾아서 카운트증가 시켰으니 해당 숫자는 종료
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < kind) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(cnt);
    }
}
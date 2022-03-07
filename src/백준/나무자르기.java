package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2805번 나무자르기
class 나무자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());

        int [] tree = new int[n];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (max < tree[i]) {
                max = tree[i];
            }
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int height : tree) {
                if (height - mid > 0) {
                    sum += (height - mid);
                }
            }

            if (sum < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
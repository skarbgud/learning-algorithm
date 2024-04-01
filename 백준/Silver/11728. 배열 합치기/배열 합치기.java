import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        int[] merge = new int[n+m];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            merge[idx++] = Integer.parseInt(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            merge[idx++] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(merge);
        StringBuilder sb = new StringBuilder();
        for (int k : merge) {
            sb.append(k).append(" ");
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] maxDp = new int[3];
        int[] minDp = new int[3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if (i == 0) {
                maxDp[0] = minDp[0] = n1;
                maxDp[1] = minDp[1] = n2;
                maxDp[2] = minDp[2] = n3;
            } else {
                int bfMaxDp_0 = maxDp[0];
                int bfMaxDp_1 = maxDp[1];
                int bfMaxDp_2 = maxDp[2];
                maxDp[0] = Math.max(maxDp[0], maxDp[1]) + n1;
                maxDp[1] = Math.max(Math.max(bfMaxDp_0, maxDp[1]), bfMaxDp_2) + n2;
                maxDp[2] = Math.max(bfMaxDp_1, bfMaxDp_2) + n3;

                int bfMinDp_0 = minDp[0];
                int bfMinDp_1 = minDp[1];
                int bfMinDp_2 = minDp[2];
                minDp[0] = Math.min(minDp[0], minDp[1]) + n1;
                minDp[1] = Math.min(Math.min(bfMinDp_0, minDp[1]), minDp[2]) + n2;
                minDp[2] = Math.min(bfMinDp_1, bfMinDp_2) + n3;
            }
        }
        int max = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
        int min = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));
        System.out.println(max + " " + min);
    }
}
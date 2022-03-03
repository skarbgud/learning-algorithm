package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 18111번 마인크래프트
class 마인크래프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int total = b;

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                total += map[i][j];
            }
        }

        int height = (int) (total / (n * m));
        if (height > 256) {
            height = 256;
        }
        int time = Integer.MAX_VALUE;
        int answer = height;
        while (0 <= height) {
            int currentTime = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] <= height) {
                        currentTime += height - map[i][j];
                    } else {
                        currentTime += (2 * (map[i][j] - height));
                    }
                }
            }
            if (currentTime < time) {
                time = currentTime;
                answer = height;
            }
            height--;
        }
        System.out.println(time + " " + answer);
    }
}
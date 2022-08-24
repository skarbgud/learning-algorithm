import java.io.*;
import java.util.StringTokenizer;

// 백준 1004번 어린왕자
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int radius = Integer.parseInt(st.nextToken());

                boolean check1 = false;
                boolean check2 = false;

                // pow => 제곱
                // 시작점이 행성의 밖에 있으면 true
                if (Math.pow(startX - x, 2) + Math.pow(startY - y, 2) > Math.pow(radius, 2)) {
                    check1 = true;
                }
                // 도착점이 행성의 밖에 있으면 true
                if (Math.pow(endX - x, 2) + Math.pow(endY - y, 2) > Math.pow(radius, 2)) {
                    {
                        check2 = true;
                    }
                }

                if ((check1 == true && check2 == false) || (check1 == false && check2 == true)) {
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.close();
        br.close();
    }
}
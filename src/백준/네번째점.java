package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 3009번 네 번째 점
class 네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()+ " ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()+ " ");
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()+ " ");
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        int x4,y4;

        if (x1 == x2) {
            x4 = x3;
        } else if (x2==x3) {
            x4 = x1;
        } else {
            x4 = x2;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y2==y3) {
            y4 = y1;
        } else {
            y4 = y2;
        }
        System.out.println(x4 + " " + y4);

    }
}
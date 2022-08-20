import java.io.*;
import java.util.StringTokenizer;

// 백준 25304번 영수증
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[6];
        int[] dir = new int[6];

        int heightMax = Integer.MIN_VALUE, widthMax = Integer.MIN_VALUE;
        int heightMin = Integer.MIN_VALUE, widthMin = Integer.MIN_VALUE;


        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() + " ");
            int d = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            dir[i] = d;
            arr[i] = val;
            if (d == 1 || d == 2) {
                widthMax = Math.max(widthMax, val);
            } else {
                heightMax = Math.max(heightMax, val);
            }
        }

        for (int i = 0; i < 6; i++) {
            int beforeDir = (i + 5) % 6;
            int nextDir = (i + 1) % 6;

            if (dir[beforeDir] == dir[nextDir]) {
                if (dir[i] == 1 || dir[i] == 2) {
                    widthMin = arr[i];
                } else {
                    heightMin = arr[i];
                }
            }
        }

        int answer = n * (heightMax * widthMax - heightMin * widthMin);
        System.out.println(answer);
    }
}
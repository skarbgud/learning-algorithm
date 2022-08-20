import java.io.*;
import java.util.StringTokenizer;

// 백준 25304번 영수증
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int item = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            sum += (item * count);
        }

        if (sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

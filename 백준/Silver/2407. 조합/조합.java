import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 백준 2407번 조합
class Main {

    public static BigInteger dpCombi[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dpCombi = new BigInteger[1001][1001];

        setDpCombination(n, m);

        System.out.println(dpCombi[n][m]);


    }

    private static void setDpCombination(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dpCombi[i][j] = new BigInteger("1");
                } else {
                    dpCombi[i][j] = dpCombi[i - 1][j - 1].add(dpCombi[i - 1][j]);
                }
            }
        }
    }
}
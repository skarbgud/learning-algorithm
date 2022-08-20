import java.io.*;

// 백준 11444번 피보나치 수 6
class Main {
    final static long MOD = 1000000007;
    public static long[][] origin = {{1, 1}, {1, 0}}; // 초기값을 갖고 있는 행렬

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] a = {{1, 1}, {1, 0}};

        long n = Long.parseLong(br.readLine());

        System.out.println(pow(a, n - 1)[0][0]);
    }

    public static long[][] pow(long[][] a, long exp) {
        if (exp == 1 || exp == 0) {
            return a;
        }

        long[][] ret = pow(a, exp / 2);

        ret = multiply(ret, ret);

        if (exp % 2 == 1L) {
            ret = multiply(ret, origin);
        }

        return ret;
    }

    public static long[][] multiply(long[][] o1, long[][] o2) {
        long[][] ret = new long[2][2];

        ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % MOD;
        ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % MOD;
        ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % MOD;
        ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % MOD;

        return ret;
    }
}
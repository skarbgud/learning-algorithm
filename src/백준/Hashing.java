package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15829번 Hashing
class Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String l = br.readLine();
        br.close();
        long m = 1234567891;
        long r = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += ((l.charAt(i) - 'a' + 1) * r) % m;
            r = (r * 31) %  m;
        }

        System.out.println(sum % m);
    }
}
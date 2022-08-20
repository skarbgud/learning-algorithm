import java.io.*;
import java.util.Scanner;

// 백준 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            cnt[i] = sc.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            cnt[i] = chess[i] - cnt[i];
            System.out.println(cnt[i]);
        }
    }
}
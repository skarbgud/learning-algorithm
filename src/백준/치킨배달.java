package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 15686번 치킨배달
class 치킨배달 {
    static int n, m, answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Position> hs, ch;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hs = new ArrayList<>();
        ch = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    hs.add(new Position(i, j));
                } else if (tmp == 2) {
                    ch.add(new Position(i, j));
                }
            }
        }
        len = ch.size();
        combination = new int[m];
        치킨배달 T = new 치킨배달();
        T.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Position p : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    dis = Math.min(dis, Math.abs(p.x - ch.get(i).x) + Math.abs(p.y - ch.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
}

class Position {
    public int x;
    public int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
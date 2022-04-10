package 백준;

import java.util.Scanner;

// 백준 1992번 쿼드트리
class 쿼드트리 {
    static int[][] tree;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                tree[i][j] = str.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, n);

        System.out.println(sb);
    }

    public static void QuadTree(int x, int y, int size) {
        // 입축이 가능한 경우 하나의 색상으로 압출한다.
        if (isPossible(x, y, size)) {
            sb.append(tree[x][y]);
            return;
        }

        int reSize = size / 2;  // 절반 사이즈

        sb.append('(');
        // 재귀 호출
        QuadTree(x, y, reSize); // 2사분면
        QuadTree(x, y + reSize, reSize); // 1사분면
        QuadTree(x + reSize, y, reSize); // 3사분면
        QuadTree(x + reSize, y + reSize, reSize); // 4사분면
        sb.append(')');
    }

    // 압축이 가능한지 해당 공간 체크해주는 함수
    private static boolean isPossible(int x, int y, int size) {
        int value = tree[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (tree[i][j] != value) {
                    return false;
                }
            }
        }
        // 검사를 모두 통과했다는 의미로 true 리턴
        return true;
    }
}
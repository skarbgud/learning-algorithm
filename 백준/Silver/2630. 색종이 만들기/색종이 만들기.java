import java.util.Scanner;

class Main {
    static int whilte = 0;
    static int blue = 0;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        partition(0, 0, n);
        System.out.println(whilte);
        System.out.println(blue);
    }

    public static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                whilte++;
            } else {
                blue++;
            }
            return;
        }
        int reSize = size / 2;  // 절반 사이즈
        // 재귀 호출
        partition(row, col, reSize); // 2사분면
        partition(row, col + reSize, reSize); // 1사분면
        partition(row + reSize, col, reSize); // 3사분면
        partition(row + reSize, col + reSize, reSize); // 4사분면
    }

    // 현재 파티션의 컬러가 같은지 체크한다
    private static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    // 색상이 같지 않다면 false 리턴
                    return false;
                }
            }
        }
        // 감사를 모두 통과했다는 의미로 true 리턴
        return true;
    }
}
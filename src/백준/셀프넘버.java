package 백준;

// 백준 4673번 셀프 넘버
class 셀프넘버 {

    public static int d(int n) {
        // 기본 첫 합은 n을 더하고 각 자리수를 더한다.
        int sum = n;

        while (n != 0) {
            // 10을 나눈 나머지를 더한다(ex.뒤에서 첫번째 자리수)
            sum += (n % 10);
            // 그다음 두번째 자리수를 n으로 넣기 위해 10을 나눈다
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { // false 인덱스만 출력
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}

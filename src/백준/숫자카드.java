package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 10815번 숫자 카드
class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine() + " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int searchItem = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, n, searchItem) + " ");
        }
        System.out.println(sb.toString());
    }

    private static int binarySearch(int[] cards, int n, int searchItem) {
        int first = 0;
        int last = n - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            // 중간값이랑 찾고자 하는 숫자카드랑 같은 경우
            if (cards[mid] == searchItem) {
                return 1;
            }
            if (cards[mid] < searchItem) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return 0;
    }
}
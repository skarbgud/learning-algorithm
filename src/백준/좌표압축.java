package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 백준 18870번 좌표 압축
class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        for (int i = 0; i < n; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬할 배열 정렬 수행
        Arrays.sort(sorted);

        int rank = 0;
        for (int v : sorted) {
            // rankingMap에 있지 않은 원소이면 순위를 넣어주고 있는 원소이면 중복값이므로 넣지않는다.
            if (!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++; // map에 넣고 나면 다음 순위를 가르킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}

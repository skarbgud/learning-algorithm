package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// 백준 1620번 나는야 포켓몬 마스터 이다솜
class 나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n + 1];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            String mon = br.readLine();
            map.put(mon, i);
            arr[i] = mon;
        }

        while (m-- > 0) {
            String what = br.readLine();
            if (isNumber(what)) {
                int index = Integer.parseInt(what);
                sb.append(arr[index]);
            } else {
                sb.append(map.get(what));
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    private static boolean isNumber(String mon) {
        try {
            int i = Integer.parseInt(mon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
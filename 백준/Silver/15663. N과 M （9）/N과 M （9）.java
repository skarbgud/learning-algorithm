import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine() + "");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        perm(0, new int[m], new boolean[n]);

        System.out.println(sb);
    }

    static void perm(int cnt, int[] selected, boolean[] visited) {
        if (cnt == m) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < cnt; i++) {
                temp.append(selected[i]).append(' ');
            }
            String str = temp.toString();
            if (!set.contains(str)) {
                set.add(str);
                sb.append(temp).append('\n');
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                selected[cnt] = arr[i];
                visited[i] = true;
                perm(cnt + 1, selected, visited);
                visited[i] = false;
            }
        }
    }
}
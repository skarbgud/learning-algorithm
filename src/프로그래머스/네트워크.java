package 프로그래머스;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, computers);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int node, boolean[] visited, int[][] computers) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }
}

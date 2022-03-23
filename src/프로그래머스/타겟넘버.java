package 프로그래머스;

public class 타겟넘버 {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }

    public static void dfs(int depth, int sum, int[] numbers, int target) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
        } else {
            dfs(depth + 1, sum + numbers[depth], numbers, target);
            dfs(depth + 1, sum - numbers[depth], numbers, target);
        }
    }
}

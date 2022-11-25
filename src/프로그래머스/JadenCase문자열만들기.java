package 프로그래머스;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        JadenCase문자열만들기 s = new JadenCase문자열만들기();
        s.solution("3people unFollowed me");
    }

    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");

        boolean isFirst = true;

        for (int i = 0; i < arr.length; i++) {
            answer += isFirst ? arr[i].toUpperCase() : arr[i];
            isFirst = arr[i].equals(" ");
        }

        return answer;
    }
}

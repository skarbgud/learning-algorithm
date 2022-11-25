package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내맘대로정렬하기 {

    public static void main(String[] args) {
        문자열내맘대로정렬하기 s = new 문자열내맘대로정렬하기();
        s.solution(new String[] {"sun", "bed", "car"}, 1);
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}

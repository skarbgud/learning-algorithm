package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        완주하지못한선수 T = new 완주하지못한선수();
        System.out.println(T.solution(part, comp));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> partMap = new HashMap<>();
        for (String part : participant) {
            partMap.put(part, partMap.getOrDefault(part, 0) + 1);
        }
        for (String comp : completion) {
            partMap.put(comp, partMap.get(comp) - 1);
        }
        for (String key : partMap.keySet()) {
            if (partMap.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}

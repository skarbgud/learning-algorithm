package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        위장 T = new 위장();
        T.solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String clothKind = cloth[1];
            map.put(clothKind, map.getOrDefault(clothKind, 0) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return answer - 1;
    }
}

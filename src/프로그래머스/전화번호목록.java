package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"123", "456", "789"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> phoneMap = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            phoneMap.put(phone_book[i], i);
        }

        for (String phone_num : phone_book) {
            for (int i = 0; i < phone_num.length(); i++) {
                if (phoneMap.containsKey(phone_num.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }
}

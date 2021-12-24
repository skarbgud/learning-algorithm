package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 백준 1157번 단어 공부
class 단어공부 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        br.close();

        int maxValue = Integer.MIN_VALUE;

        char answer = '?';

        Map<Character, Integer> wordMap = new HashMap<>();

        for (char x : word.toCharArray()) {
            wordMap.put(Character.toUpperCase(x), wordMap.getOrDefault(Character.toUpperCase(x), 0) + 1);
        }

        for (char k : wordMap.keySet()) {
            if (wordMap.get(k) >= maxValue) {
                maxValue = wordMap.get(k);
                answer = k;
            }
        }

        int duplicate = 0;

        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                duplicate++;
            }
        }

        if (duplicate > 1) {
            answer = '?';
        }

        System.out.println(answer);
    }
}

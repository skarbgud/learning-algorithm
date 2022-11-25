package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최소값 {

    public static void main(String[] args) {
        최댓값과최소값 c = new 최댓값과최소값();
        c.solution("-1 2 -3 -4");
    }

    public String solution(String s) {
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String a : arr) {
            list.add(Integer.parseInt(a));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0)).append(" ").append(list.get(list.size() - 1));

        return sb.toString();
    }
}

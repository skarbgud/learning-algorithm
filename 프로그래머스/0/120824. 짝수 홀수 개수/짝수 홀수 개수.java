import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> hol = new ArrayList<>();
        List<Integer> jack = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                jack.add(num_list[i]);
            } else {
                hol.add(num_list[i]);           
            }
        }
        int[] answer = {jack.size(), hol.size()};
        return answer;
    }
}
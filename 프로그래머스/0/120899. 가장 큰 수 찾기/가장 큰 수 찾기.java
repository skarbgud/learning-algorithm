import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        int[] answer = {max,idx};
        return answer;
    }
}
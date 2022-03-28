package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum T = new TwoSum();
        T.solution(new int[]{2, 7, 11, 15}, 9);
    }

    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int remain =target - nums[i];
            if (map.containsKey(remain) && map.get(remain) != i) {
                return new int[] {i, map.get(remain)};
            }
        }
        return null;
    }
}

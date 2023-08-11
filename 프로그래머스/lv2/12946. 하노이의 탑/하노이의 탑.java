import java.util.*;

class Solution {
    static List<int[]> list;
    
    public int[][] solution(int n) {
        list = new ArrayList<>();
        
        recursion(1, 2, 3, n);
        
        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            int[] tmp = list.get(i);
            answer[i][0] = tmp[0];
            answer[i][1] = tmp[1];
        }
    
        return answer;
    }
    static void recursion(int start, int via, int end, int n) {
        if (n == 1) {
            list.add(new int[]{start, end});
            return;
        }
        
        recursion(start, end, via, n - 1);
        list.add(new int[] {start, end});
        recursion(via, start, end, n - 1);
    }
}
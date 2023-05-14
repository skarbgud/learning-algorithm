class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if (arr.length == 1) {
            answer = new int[] {-1};
            return answer;
        }
        
        int min = arr[0];        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            } else {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}
class Solution {
    public int reverse(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean minusFlag = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '-') {
                minusFlag = true;
                continue;
            }
            sb.append(arr[i]);
        }
        
        try {
            return minusFlag ?Integer.parseInt('-' + sb.toString()) : Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
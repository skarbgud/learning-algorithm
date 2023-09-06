class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }
        System.out.println();
        for (Character c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
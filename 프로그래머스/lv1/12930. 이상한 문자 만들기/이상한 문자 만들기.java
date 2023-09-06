class Solution {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ", -1)) {
            for (int i = 1; i < s.toCharArray().length + 1; i++) {
                if (i % 2 == 1) {
                    sb.append(Character.toUpperCase(s.toCharArray()[i-1]));
                } else {
                    sb.append(Character.toLowerCase(s.toCharArray()[i-1]));
                }
            }
            
            if (str.length() != sb.toString().length()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
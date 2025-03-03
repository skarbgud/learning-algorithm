class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; //음수는 회문 아님
        
        String str = String.valueOf(x); //정수를 문자열로 변환
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if (str.charAt(left) != str.charAt(right))  {   //왼쪽이랑 오른쪽이라 같이 않을때 
                return false;
            }
            left++;  //동시에 왼쪽과 오른쪽을 한칸씩 옮긴다.
            right--;
        }
        return true;
    }
}
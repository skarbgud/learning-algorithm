class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        long x = (long)sqrt;
        if (n == (x * x)) {
            return  (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
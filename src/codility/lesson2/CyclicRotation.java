package codility.lesson2;

public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation b = new CyclicRotation();

        int[] arr = {3, 8, 9, 7, 6};
        for (int x : b.solution(arr,9)) {
            System.out.println(x);
        }
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0) return A;
        for (int i = 0; i < K; i++) {
            int lastNum = A[A.length-1];
            for (int j = A.length-1; j > 0; j--) {
                A[j] = A[j-1];
            }
            A[0] = lastNum;
        }
        return A;
    }
}
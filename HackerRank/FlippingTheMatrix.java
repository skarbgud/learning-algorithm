class Result {
    /*
    * Complete the 'flippingMatrix' function below.
    *
    1
    2
    3
    4
    5
    6
    5/5
    * The function is expected to return an INTEGER.
    * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
    */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n; j++) {
                int topLeft = matrix.get(i).get(j);
                int topRight = matrix.get(i).get(2 * n - j - 1);
                int bottomLeft = matrix.get(2 * n - i - 1).get(j);
                int bottomRight = matrix.get(2 * n - i - 1).get(2 * n - j - 1);

                maxSum +=Math.max(Math.max(topLeft, topRight),
                Math.max(bottomLeft, bottomRight));
            }
        }
        return maxSum;
    }
}
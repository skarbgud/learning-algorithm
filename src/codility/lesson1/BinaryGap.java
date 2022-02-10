package codility.lesson1;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		System.out.println(b.solution(9));
	}
	
	public int solution (int N) {
		String binary = Integer.toBinaryString(N);
	    String[] arr = binary.split("");
		
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				count++;
			} else {
				max = (max > count) ? max : count;
				count = 0;
			}
		}
        return max;
	}
}

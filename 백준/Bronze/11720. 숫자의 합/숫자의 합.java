import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String str = sc.next();
        
        char[] charArr = str.toCharArray();
        
        int answer = 0;
        for (int i = 0; i < charArr.length; i++) {
            answer += Integer.valueOf(String.valueOf(charArr[i]));
        }
        System.out.println(answer);
    }
}
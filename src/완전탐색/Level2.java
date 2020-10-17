package 완전탐색;

import java.util.HashSet;
import java.util.Set;

public class Level2 {
    public static void main(String[] args) {
        String numbers = "101";
        Level2 level2 = new Level2();
        level2.solution(numbers);
    }

    public int solution(String numbers) {
        char[] list = numbers.toCharArray();

        Set<Integer> sosuList = new HashSet<>();
        for (int i = 1; i <= list.length; i++) {
            perm(list, 0, i, sosuList);
        }

        System.out.println("소수 리스트입니다.");
        System.out.println(sosuList);

        return sosuList.size();
    }

    public void perm(char [] arr, int depth, int k, Set sosuList) {
        if (depth == k) {
            print(arr, k, sosuList);
            return;
        } else {
            for (int i = depth; i < arr.length; i++) {
                swap(arr, i, depth);
                perm(arr, depth + 1, k, sosuList);
                swap(arr, i, depth);
            }
        }
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(char[] arr, int k, Set sosuList) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < k; i++) {
            a.append(arr[i]);
        }
        isSosu(sosuList, a);
    }

    private void isSosu(Set sosuList, StringBuilder a) {
        int b = Integer.parseInt(String.valueOf(a));
        boolean sosu = true;
        if (b <= 1) {
            return;
        }
        for (int j = 2; j <= Math.sqrt(b); j++) {
            if (b % j == 0) {
                sosu = false;
                break;
            }
        }
        if (sosu) {
            sosuList.add(b);
        }
    }
}

package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int p;
    public int d;

    Lecture(int p, int d) {
        this.p = p;
        this.d = d;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.d - this.d;
    }
}

// 백준 2109번 순회강연
class 순회강연 {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).d < i) {
                    break;
                }
                pQ.offer(arr.get(j).p);
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int d = sc.nextInt();

            if (max < d) {
                max = d;
            }
            arr.add(new Lecture(p, d));
        }

        순회강연 T = new 순회강연();
        System.out.println(T.solution(arr));
    }
}
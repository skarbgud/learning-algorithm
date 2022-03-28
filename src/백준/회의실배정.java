package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 백준 1931번 회의실배정
class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MeetingRoom> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new MeetingRoom(start, end));
        }
        회의실배정 T = new 회의실배정();
        System.out.println(T.solution(arr, n));
    }

    public int solution(List<MeetingRoom> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0;
        for (MeetingRoom m : arr) {
            if (m.start >= endTime) {
                endTime = m.end;
                cnt++;
            }
        }

        return cnt;
    }
}

class MeetingRoom implements Comparable<MeetingRoom> {
    public int start, end;

    public MeetingRoom(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(MeetingRoom m) {
        if (m.end == this.end) {
            return this.start - m.start;
        } else {
            return this.end - m.end;
        }
    }
}


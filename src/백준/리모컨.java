package 백준;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 백준 1107번 리모컨
class 리모컨 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> brokenButton = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int button = sc.nextInt();
            brokenButton.add(button);
        }

        // 100에서 +-만 이용할때 (기본값이 100이므로 n만큼 움질일때)
        int answer = Math.abs(100 - n);

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            boolean check = true;

            // 원하는 채널을 버트이 포함하고 있으면 check하지 않는다.
            for (int j = 0; j < str.length(); j++) {
                if (brokenButton.contains(str.charAt(j) - '0')) {
                    check = false;
                    break;
                }
            }
            if (check == false) {
                continue;
            }

            // 고장나지 않은 버튼으로 누를 수 있는 버튼 중 최소값을 구한다.
            cnt = str.length() + Math.abs(i-n);

            if (cnt < min) {
                min = cnt;
            }
        }
        answer = Math.min(answer, min);
        System.out.println(answer);
    }
}
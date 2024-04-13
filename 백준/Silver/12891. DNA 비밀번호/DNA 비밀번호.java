import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); //문자열의 총길이
        int p = Integer.parseInt(st.nextToken()); //부분물자열 길이
        int answer = 0;
        myArr = new int[4];     //슬라이딩윈도우로 들어갈 ACGT문자열 개수
        checkArr = new int[4];  //체크해야할 ACGT문자열개수
        checkSecret = 0;

        char[] a = br.readLine().toCharArray(); //문자열입력
        st = new StringTokenizer(br.readLine());

        // 체크해야할문자열의 개수 입력
        for (int i = 0 ; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++; //0이면 체크해야할 개수가 하나가 줄어듦
            }
        }

        for (int i = 0 ; i < p; i++) { //부분문자열 처음 받을때 세팅
            add(a[i]);
        }

        if (checkSecret == 4) {
            answer++;
        }

        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) { //p까지는 위에서 받았으니까 문자열끝까지 1칸씩 이동
            int j = i - p; // 슬라이딩 윈도우의 시작점
            add(a[i]);
            remove(a[j]);
            if (checkSecret == 4) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}
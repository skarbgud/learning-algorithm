import java.io.*;
import java.util.HashSet;

// 백준 11478번 서로 다른 부분 문자열의 개수
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String unique = "";

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            unique = "";
            for (int j = i; j < str.length(); j++) {
                unique += str.substring(j, j + 1);
                hashSet.add(unique);
            }
        }

        System.out.println(hashSet.size());
    }
}
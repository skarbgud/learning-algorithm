package 백준;

import java.io.*;
import java.util.*;

// 백준 11723번 집합
class 집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            String[] command = br.readLine().split(" ");
            if (command.length > 1) {
                String value = command[1];
                if (command[0].equals("add")) {
                    if (!set.contains(Integer.parseInt(value))) {
                        set.add(Integer.parseInt(value));
                    }
                } else if (command[0].equals("remove")) {
                    if (set.contains(Integer.parseInt(value))) {
                        set.remove(Integer.parseInt(value));
                    }
                } else if (command[0].equals("check")) {
                    if (set.contains(Integer.parseInt(value))) {
                        bw.write(1 + "\n");

                    } else {
                        bw.write(0 + "\n");

                    }
                } else if (command[0].equals("toggle")) {
                    if (set.contains(Integer.parseInt(value))) {
                        set.remove(Integer.parseInt(value));
                    } else {
                        set.add(Integer.parseInt(value));
                    }
                }
            } else {
                if (command[0].equals("all")) {
                    set = new HashSet<>();
                    for (int j = 1; j < 21; j++) {
                        set.add(j);
                    }
                } else {
                    set.clear();
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
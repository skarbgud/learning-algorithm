package 프로그래머스;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 신고결과받기 {
    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> repoortMemberList = new HashMap<>();
        Map<String, Integer> getMailCount = new HashMap<>();
        for (String id : id_list) {
            getMailCount.put(id, 0);
            repoortMemberList.put(id, new HashSet<>());
        }

        for (String rep : report) {
            String[] checkReport = rep.split(" ");
            repoortMemberList.get(checkReport[1]).add(checkReport[0]);
        }

        for (String key: repoortMemberList.keySet()) {
            HashSet<String> reporters = repoortMemberList.get(key);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    Integer getMail = getMailCount.get(reporter);
                    getMailCount.put(reporter, getMail + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getMailCount.get(id_list[i]);
        }
        return answer;
    }
}

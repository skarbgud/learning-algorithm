package 완전탐색;

import java.util.ArrayList;
import java.util.List;


public class Level1 {
    public static void main(String[] args) {
        Level1 level1 = new Level1();
        int [] answersList = {1,2,3,4,5,4,2};
        level1.solution(answersList);
    }

    public int[] solution(int[] answers) {
        int person1[] = { 1, 2, 3, 4, 5};
        int person2[] = { 2, 1, 2, 3, 2, 4, 2, 5};
        int person3[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i =0; i< answers.length; i++) {
            if(person1[i % person1.length] == answers[i]) {
                score1++;
            }
            if(person2[i % person2.length] == answers[i]) {
                score2++;
            }
            if(person3[i % person3.length] == answers[i]) {
                score3++;
            }
        }
        int[] result = {score1,score2,score3};

        List<Integer> highScorePerson = new ArrayList<Integer>(); //List만들어주고 최대값 비교

        int max = Math.max(Math.max(score1,score2),score3);

        if(max == result[0]){ highScorePerson.add(1);}
        if(max == result[1]){ highScorePerson.add(2);}
        if(max == result[2]){ highScorePerson.add(3);}

        int [] answer = new int[highScorePerson.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = highScorePerson.get(i);
        }

        return answer;
    }
}

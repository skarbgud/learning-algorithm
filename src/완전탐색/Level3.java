package 완전탐색;

public class Level3 {
    public static void main(String[] args) {
        Level3 level3 = new Level3();
        level3.solution(10,2);
    }


    public int[] solution(int brown, int yellow) {
        int height = 0;
        int width = 0;

        for(height = 3; height <= (int) (brown + 4) / 2; height++) {
            width = ((brown + 4) / 2) - height;
            if(width < height) {
                break;
            }

            int yellowNum = (width - 2) * (height - 2);
            if(yellow == yellowNum){
                break;
            }
        }
        int[] answer = {width, height};
        return answer;
    }
}

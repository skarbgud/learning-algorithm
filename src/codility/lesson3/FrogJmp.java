package codility.lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // distance 이동해야 할 거리
        int distance = Y - X;
        // 이동거리가 0보다 작거나 같으면 이동횟수 0번 반환
        if (distance <= 0) {
            return 0;
        }
        // 이동거리를 점프만큼 나눈다
        double cnt = distance / (double) D;
        // 나눈값을 소수점 올림
        return (int) Math.ceil(cnt);
    }
}

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        long temp = 1;
        for(int i=1; i<=share; i++) {
            temp *= balls;
            temp /= i;
            balls--;
        }
        answer = (int)temp;
        return answer;
    }
}
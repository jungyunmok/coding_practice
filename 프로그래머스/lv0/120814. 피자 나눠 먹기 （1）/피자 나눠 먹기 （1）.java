class Solution {
    public int solution(int n) {
        int answer = 0;
        double temp = (double)n/7;
        if(temp == (int)temp){
            answer = (int)temp;
        } else if(temp < 1){
            answer = 1;
        } else {
            answer = (int)temp + 1;
        }
        return answer;
    }
}
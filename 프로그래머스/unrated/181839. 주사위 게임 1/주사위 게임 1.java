class Solution {
    public int solution(int a, int b) {
        int answer = (a+b)%2 == 0 ?(a%2 == 0 ? (a-b) : (a*a+b*b)) : 2*(a+b);
        if(answer < 0) {
            answer *= -1;
        }
        return answer;
    }
}
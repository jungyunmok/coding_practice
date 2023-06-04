class Solution {
    public int solution(int order) {
        int answer = 0;
        for(int i=10; i<=order*10; i=i*10) {
            answer += order%i/(i/10) == 3 || order%i/(i/10) == 6 || order%i/(i/10) == 9 ? 1 : 0;
        }
        return answer;
    }
}
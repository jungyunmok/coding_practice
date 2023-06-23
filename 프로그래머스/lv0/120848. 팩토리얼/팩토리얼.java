class Solution {
    public int solution(int n) {
        int answer = n == 1 ? 1 : 0;
        int cnt = 1;
        while(cnt < n) {
            cnt *= answer == 0 ? 1 : answer;
            answer += cnt*(answer+1) <= n ? 1 : 0;
        }
        return answer;
    }
}
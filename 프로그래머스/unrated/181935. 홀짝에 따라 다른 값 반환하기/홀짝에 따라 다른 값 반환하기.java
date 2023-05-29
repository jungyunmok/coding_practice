class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            answer += n%2==0 ? (i%2==0 ? i*i : 0) : (i%2==0 ? 0 : i);
        }
        return answer;
    }
}
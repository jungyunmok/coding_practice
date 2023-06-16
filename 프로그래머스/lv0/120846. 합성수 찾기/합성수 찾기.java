class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=4; i<=n; i++) {
            int count = 0;
            for(int j=1; j<=i; j++) {
                count += i%j == 0 ? 1 : 0;
                if(count >= 3) {
                    answer += 1;
                    break;
                }
            }            
        }
        return answer;
    }
}
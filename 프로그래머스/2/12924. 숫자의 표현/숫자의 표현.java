class Solution {
    public int solution(int n) {
        int answer = n > 1 ? 1 : 0;
        int sum = 0;
        int index = 1;
        for(int i=index; i<=n/2+1; i++) {
            sum += i;
            if(sum >= n) {
                if(sum == n) answer++;
                index++;
                i=index;
                sum = 0;
            }
        }
        return answer;
    }
}
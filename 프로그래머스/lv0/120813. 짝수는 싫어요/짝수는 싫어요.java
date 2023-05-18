class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.round(n/2.0)];
        int indexNo = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 > 0) {
                answer[indexNo++] = i;
            }
        }
        return answer;
    }
}
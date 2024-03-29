class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int total = 1;
        int count = 2;
        while(count <= n) {
            if(n%count == 0 && m%count == 0) {
                total *= count;
                n /= count;
                m /= count;
            } else {
                count++;
            }
        }
        answer[0] = total;
        answer[1] = total * n * m;
        return answer;
    }
}
class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int temp = slice;
        
        while(slice < n) {
            answer++;
            slice += temp;
        }
        
        return answer;
    }
}
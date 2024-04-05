class Solution {
    public int solution(int M, int N) {
        int mCount = M-1;
        int nCount = N-1;
        int answer = M * nCount + mCount;
        return answer;
    }
}
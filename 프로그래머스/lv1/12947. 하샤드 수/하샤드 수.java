class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int temp = 0;
        for(int i=10; i<=x*10; i=i*10) {
            temp += x%i/(i/10);
        }
        answer = x%temp == 0 ? true : false;
        return answer;
    }
}
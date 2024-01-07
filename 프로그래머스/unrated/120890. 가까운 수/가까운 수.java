class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        for(int number : array) {
            int temp1 = number - n;
            int temp2 = answer - n;
            if(temp1 < 0) temp1 *= -1;
            if(temp2 < 0) temp2 *= -1;
            if(temp1 < temp2) answer = number;
            else if(temp1 == temp2) {
                answer = number < answer ? number : answer;
            }
        }
        return answer;
    }
}
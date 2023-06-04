class Solution {
    public int[] solution(int n) {
        int[] temp = new int[n];
        int length = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                temp[length] = i;
                length++;
            }
        }
        int index = 0;
        int[] answer = new int[length];
        for(int num : temp) {
            if(num > 0) {
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }
}
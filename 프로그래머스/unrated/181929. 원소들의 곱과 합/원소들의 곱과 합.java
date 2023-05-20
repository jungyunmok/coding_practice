class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp1 = 1;
        int temp2 = 0;
        for(int num : num_list) {
            temp1 *= num;
            temp2 += num;
        }
        if(temp1 < temp2*temp2) {
            answer = 1;
        }
        return answer;
    }
}
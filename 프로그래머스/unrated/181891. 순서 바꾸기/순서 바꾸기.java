class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length-n; i++) {
            answer[i] = num_list[n+i];
        }
        int temp = 0;
        for(int j=num_list.length-n; j<answer.length; j++) {
            answer[j] = num_list[temp];
            temp++;
        }
        return answer;
    }
}
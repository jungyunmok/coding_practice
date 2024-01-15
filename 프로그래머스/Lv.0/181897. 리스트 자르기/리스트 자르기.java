class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int start = n==1 ? 0 : slicer[0];
        int end = n==2 ? num_list.length-1 : slicer[1];
        int plus = n==4 ? slicer[2] : 1;
        int index = 0;
        if(n==4) {
            answer = new int[((end-start+1)/slicer[2])+(end-start+1)%slicer[2]];
        } else {
            answer = new int[end-start+1];
        }
        for(int i=start; i<=end; i+=plus) {
        answer[index] = num_list[i];
        index++;
        }
        return answer;
    }
}
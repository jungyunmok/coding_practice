class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for(boolean tof : finished) {
            length = tof ? length+0 : length+1;
        }
        String[] answer = new String[length];
        int index = 0;
        for(int i=0; i<todo_list.length; i++) {
            if(!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}
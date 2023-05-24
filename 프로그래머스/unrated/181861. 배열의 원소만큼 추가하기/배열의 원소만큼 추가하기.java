class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int num : arr) {
            length += num;
        }
        int[] answer = new int[length];
        int j = 0;
        int temp = 0;
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr[j];
            temp++;
            if(j < arr.length-1 && temp == arr[j]) {
                j++;
                temp = 0;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int length = arr.length;
        for(int i=0; i<arr.length; i++) {
            for(int del : delete_list) {
                if(arr[i] == del) {
                    arr[i] = -1;
                    length--;
                }
            }
        }
        int[] answer = new int[length];
        int index = 0;
        for(int num : arr) {
            if(num > 0) {
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }
}
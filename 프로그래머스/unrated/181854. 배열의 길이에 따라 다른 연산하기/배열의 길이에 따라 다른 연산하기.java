class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.length%2 == 0 ? (i%2 == 0 ? arr[i] : arr[i]+n) : (i%2 == 0 ? arr[i]+n : arr[i]);
        } 
        return answer;
    }
}
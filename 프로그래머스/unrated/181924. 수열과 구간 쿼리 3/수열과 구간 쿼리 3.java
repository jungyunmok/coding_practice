class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int[] query : queries) {
            int temp1 = arr[query[0]];
            int temp2 = arr[query[1]];
            arr[query[0]] = temp2;
            arr[query[1]] = temp1;
        }
        answer = arr;
        return answer;
    }
}
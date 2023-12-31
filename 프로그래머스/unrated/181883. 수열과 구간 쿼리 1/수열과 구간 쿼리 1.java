class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int length = answer.length;
        for(int[] query : queries) {
            int n1 = query[0];
            int n2 = query[1];
            if(n1 >= 0 && n2 < length) {
                for(int i = n1; i <= n2; i++) {
                    answer[i] = answer[i] + 1;
                }
            }
        }
        return answer;
    }
}
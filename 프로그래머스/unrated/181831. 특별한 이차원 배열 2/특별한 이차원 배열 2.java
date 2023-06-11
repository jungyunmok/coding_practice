class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                answer += arr[i][j] == arr[j][i] ? 1 : 0;
                temp++;
            }
        }
        answer = answer == temp ? 1 : 0;
        return answer;
    }
}
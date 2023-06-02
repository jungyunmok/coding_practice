class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(n).substring(answer.length-i-1, answer.length-i));
        }
        return answer;
    }
}
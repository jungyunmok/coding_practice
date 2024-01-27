class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(String str : my_string.split("")) {
            int num = (byte)str.charAt(0);
            if(num < 97) {
                answer[num-65]++;
            } else {
                answer[num-97+(answer.length/2)]++;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zeroNum = 0;
        while(!"1".equals(s)) {
            zeroNum += s.length() - s.replace("0", "").length();
            s = String.valueOf(Integer.toBinaryString(s.replace("0", "").length()));
            count++;
        }
        answer[0] = count;
        answer[1] = zeroNum;
        return answer;
    }
}
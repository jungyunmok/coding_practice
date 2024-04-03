class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = Integer.toBinaryString(n);
        int length = strN.length() - strN.replace("1", "").length();
        while(answer < n) {
            n++;
            String binary = Integer.toBinaryString(n);
            int binaryLength = binary.length() - binary.replace("1", "").length();
            if(length == binaryLength) answer = n;
        }
        return answer;
    }
}
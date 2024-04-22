class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] sArr = s.split("");
        for(int i=0; i<sArr.length; i++) {
            if(!sArr[i].equals(" ")) {
                int ch = sArr[i].charAt(0) + n;
                if(sArr[i].equals(sArr[i].toUpperCase())) {
                    ch = ch > 90 ? ch-26 : ch;
                    answer += String.valueOf((char)ch).toUpperCase();
                } else {
                    ch = ch > 122 ? ch-26 : ch;
                    answer += String.valueOf((char)ch).toLowerCase();
                }
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}
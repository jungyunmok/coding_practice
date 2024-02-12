class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strNumbers = s.split(" ");
        int max = Integer.parseInt(strNumbers[0]);
        int min = Integer.parseInt(strNumbers[0]);
        for(int i=1; i<strNumbers.length; i++) {
            int num = Integer.parseInt(strNumbers[i]);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        answer = min + " " + max;
        return answer;
    }
}
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);
        int length = pat.length();
        answer = myString.substring(0, index + length);
        return answer;
    }
}
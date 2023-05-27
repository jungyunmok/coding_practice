class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        for(int i=0; i<myString.length(); i++) {
            temp += myString.substring(i, i+1).equals("A") ? "B" : "A";
        }
        answer = temp.contains(pat) ? 1 : 0;
        return answer;
    }
}
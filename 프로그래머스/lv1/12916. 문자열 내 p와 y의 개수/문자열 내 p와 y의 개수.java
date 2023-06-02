class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.toLowerCase().substring(i, i+1).equals("p")) {
                p++;
            } else if(s.toLowerCase().substring(i, i+1).equals("y")) {
                y++;
            }
        }
        answer = p == y ? true : false;
        return answer;
    }
}
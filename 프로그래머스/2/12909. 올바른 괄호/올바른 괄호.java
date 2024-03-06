class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(String str : s.split("")) {
            if(str.equals("(")) {
                count++;
            } else if(str.equals(")")) {
                count--;
            }
            if(count < 0) return answer;
        }
        if(count == 0) answer = true;
        return answer;
    }
}
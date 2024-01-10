import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(String str : s.split("")) {
            if(!answer.contains(str) && s.chars().filter(c->c==str.charAt(0)).count() == 1) {
                answer += str;
            }
        }
        String[] temp = answer.split("");
        Arrays.sort(temp);
        answer = String.join("",temp);
        return answer;
    }
}
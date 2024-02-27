import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String temp[] = s.split(" ", -1);
        for(int i=0; i<temp.length; i++) {
            String str = temp[i].toLowerCase();
            if(str.length() != 0) {
                String first = str.substring(0, 1);
                if(first.matches("[0-9]") || first.equals(" ")) {
                answer += str;
                } else {
                    answer += first.toUpperCase() + str.substring(1);
                }
            }
            if(i < temp.length - 1) answer += " ";
        }
        return answer;
    }
}
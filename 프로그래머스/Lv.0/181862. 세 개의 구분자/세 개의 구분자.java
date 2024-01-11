import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        if(myStr.replaceAll("a|b|c", "").length() == 0) {
            answer = new String[] {"EMPTY"};
        } else {
            String[] temp = myStr.split("a|b|c");
            answer = Arrays.stream(temp).filter(s -> !s.equals("")).toArray(String[]::new);
        }
        return answer;
    }
}
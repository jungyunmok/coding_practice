import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] temp = my_string.toLowerCase().split("");
        Arrays.sort(temp);
        String answer = "";
        for(String str : temp) {
            answer += str;
        }
        return answer;
    }
}
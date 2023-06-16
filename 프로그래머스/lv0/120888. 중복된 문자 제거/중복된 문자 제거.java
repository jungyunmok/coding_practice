import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] temp = my_string.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(temp));
        String answer = "";
        for(String str : set) {
            answer += str;
        }
        return answer;
    }
}
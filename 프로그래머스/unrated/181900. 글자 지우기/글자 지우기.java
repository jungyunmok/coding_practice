import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] temp = my_string.split("");
        for(int num : indices) {
            temp[num] = "";
        }
        for(String str : temp) {
            answer += str;
        }
        return answer;
    }
}
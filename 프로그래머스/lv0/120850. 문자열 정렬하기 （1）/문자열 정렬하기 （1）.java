import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.replaceAll("[a-zA-z]", "").length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Character.getNumericValue(my_string.replaceAll("[a-zA-z]", "").charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        Arrays.fill(answer, -1);
        for(int i=1; i<s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(sArr[i].equals(sArr[j])) {
                    answer[i] = i-j;
                }
            }
        }
        return answer;
    }
}
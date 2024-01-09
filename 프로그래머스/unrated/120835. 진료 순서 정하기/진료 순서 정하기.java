import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        Arrays.sort(emergency);
        for(int j=0; j<answer.length; j++) {
            for(int k=0; k<emergency.length; k++) {
                if(answer[j] == emergency[k]) {
                    answer[j] = emergency.length-k;
                    break;
                }
            }
        }
        return answer;
    }
}
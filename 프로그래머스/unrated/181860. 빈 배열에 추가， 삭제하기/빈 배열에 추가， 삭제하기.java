import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        for(int i=0; i<flag.length; i++){
            int[] temp = {};
            if(flag[i]) {
                temp = new int[answer.length + arr[i]*2];
                Arrays.fill(temp, arr[i]);
                if(answer.length > 0) {
                    for(int j=0; j<answer.length; j++) {
                        temp[j] = answer[j];
                    }
                }
            } else {
                temp = new int[answer.length - arr[i]];
                for(int k=0; k<temp.length; k++) {
                        temp[k] = answer[k];
                    }
            }
            answer = temp;
        }
        return answer;
    }
}
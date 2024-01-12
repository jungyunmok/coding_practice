import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) {
            answer = new int[] {-1};
        } else {
           answer = Arrays.stream(arr).filter(i->i!=Arrays.stream(arr).min().getAsInt()).toArray();
        }
        return answer;
    }
}
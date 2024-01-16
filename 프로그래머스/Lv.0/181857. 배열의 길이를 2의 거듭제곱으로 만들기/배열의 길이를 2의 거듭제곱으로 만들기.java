import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int exponent = 0;
        int gap = 1;
        while(gap > 0) {
            int temp = (int)Math.pow(2, exponent);
            gap = arr.length - temp;
            if(gap <= 0) {
                answer = new int[temp];
                break;
            }
            exponent++;
        }
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
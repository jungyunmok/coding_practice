import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] temp = String.valueOf(n).split("");
        Arrays.sort(temp);
        String str = "";
        for(int i=temp.length-1; i>-1; i--) {
            str += temp[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}
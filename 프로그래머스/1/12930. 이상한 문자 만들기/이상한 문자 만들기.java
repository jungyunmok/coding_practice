import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int count = 0;
        for(int i=0; i<strArr.length; i++) {
            if(" ".equals(strArr[i])) {
                answer += strArr[i];
                count = 0;
            }
            else if(count%2 == 0) {
                answer += strArr[i].toUpperCase();
                count++;
            } else {
                answer += strArr[i].toLowerCase();
                count++;
            }
        }
        return answer;
    }
}
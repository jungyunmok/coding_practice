import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array) {
            String strNum = String.valueOf(num);
            if(strNum.contains("7")) {
                for(String str : strNum.split("")) {
                    if(str.equals("7")) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
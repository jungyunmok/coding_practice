import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> strCount = new HashMap<>();
        for(String str :strArr) {
            if(strCount.get(str.length()) != null) {
                strCount.put(str.length(), strCount.get(str.length())+1);
            } else {
                strCount.put(str.length(), 1);
            }
        }
        answer = Collections.max(strCount.values());
        return answer;
    }
}
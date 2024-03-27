import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> rankList = new HashMap();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                rankList.put(rank[i], i);
            }
        }
        List<Integer> temp = new ArrayList<>(rankList.keySet());
        Collections.sort(temp);
        int count = 0;
        int multiply = 10000;
        for(Integer num : temp) {
            answer += multiply*rankList.get(num);
            count++;
            multiply /= 100;
            if(count == 3) break;
        }
        return answer;
    }
}
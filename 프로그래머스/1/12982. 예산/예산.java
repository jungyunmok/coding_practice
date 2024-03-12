import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = 0;
        Arrays.sort(d);
        for(int i : d) {
            money += i;
            if(money <= budget) {
                answer++;
            } else if(money > budget) {
                break;
            }
        }
        return answer;
    }
}
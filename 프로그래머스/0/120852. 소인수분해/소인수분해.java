import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> numbers = new ArrayList();
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                while(n%i == 0) {
                n /= i;
                }
                numbers.add(i);
            }
        }
        answer = numbers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
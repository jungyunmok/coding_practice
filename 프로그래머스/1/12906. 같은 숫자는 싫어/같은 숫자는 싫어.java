import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> tempList = new ArrayList();
        for(int n : arr) {
            if(tempList.size() == 0 || tempList.get(tempList.size()-1) != n) {
                tempList.add(n);
            }
        }
        answer = tempList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
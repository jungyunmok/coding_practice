import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> aList = new ArrayList<>();
        for(int num : arr) {
            if(num % divisor == 0) {
                aList.add(num);
            }
        }
        Collections.sort(aList);
        int[] answer = aList.size() > 0 ? aList.stream().mapToInt(Integer::intValue).toArray() : new int[] {-1};
        return answer;
    }
}
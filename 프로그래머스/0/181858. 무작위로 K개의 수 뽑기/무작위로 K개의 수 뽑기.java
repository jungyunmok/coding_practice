import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> tempList = new ArrayList(Collections.nCopies(k, -1));
        int index = 0;
        for(int n : arr) {
            if(!tempList.contains(n)) {
                tempList.set(index, n);
                index++;
                if(index == k) break;
            }           
        }
        answer = tempList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> intList = new ArrayList();
        for(int i=0; i<arr.length; i++) {
            if(intList.size() == 0) {
                intList.add(arr[i]);
            } else {
                if(intList.get(intList.size()-1) == arr[i]) {
                    intList.remove(intList.size()-1);
                } else {
                    intList.add(arr[i]);
                }
            }
        }
        if(!intList.isEmpty()) answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
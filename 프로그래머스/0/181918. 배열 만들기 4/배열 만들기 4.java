import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> intList = new ArrayList();
        int index = 0;
        while(index < arr.length) {
            if(intList.isEmpty()) {
                intList.add(arr[index]);
                index++;
            } else {
                if(intList.get(intList.size()-1) < arr[index]) {
                    intList.add(arr[index]);
                    index++;
                } else {
                    intList.remove(intList.size()-1);
                }
            }
        }
        int[] stk = intList.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}
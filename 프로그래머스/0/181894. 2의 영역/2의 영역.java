import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> intArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int count = Collections.frequency(intArr, 2);
        if(count == 1) {
            answer = new int[] {2};
        } else if(count > 1) {
            int index = 0;
            int firstIndex = intArr.indexOf(2);
            int lastIndex = intArr.lastIndexOf(2);
            answer = new int[lastIndex-firstIndex+1];
            for(int i=firstIndex; i<=lastIndex; i++) {
                answer[index] = arr[i];
                index++;
            }
        } else {
            answer = new int[] {-1};
        }
        return answer;
    }
}
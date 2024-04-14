import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i=0; i<query.length; i++) {
            int length = numList.size();
            if(i % 2 == 0 || i == 0) {
                for(int j=query[i]+1; j<length; j++) {
                    numList.remove(query[i]+1);
                }
            } else {
                for(int k=0; k<query[i]; k++) {
                    numList.remove(0);
                }
            }
        }
        answer = numList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
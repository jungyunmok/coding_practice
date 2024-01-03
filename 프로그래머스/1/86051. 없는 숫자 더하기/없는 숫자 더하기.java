import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String[] strNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        List<String> strNumberList = new ArrayList<>(Arrays.asList(strNumbers));
        for(int i=1; i<10; i++) {
            if(!strNumberList.contains(String.valueOf(i))) {
                answer += i;
            }
        }
        return answer;
    }
}
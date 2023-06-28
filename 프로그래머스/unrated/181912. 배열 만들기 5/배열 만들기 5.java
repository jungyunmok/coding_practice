import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : intStrs) {
            if(Integer.parseInt(str.substring(s, s+l)) > k) {
                arr.add(Integer.parseInt(str.substring(s, s+l)));
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
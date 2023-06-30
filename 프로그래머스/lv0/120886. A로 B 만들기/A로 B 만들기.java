import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arrA = after.toCharArray();
        char[] arrB = before.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        String a = new String(arrA);
        String b = new String(arrB);
        if(a.equals(b)) answer = 1;
        return answer;
    }
}
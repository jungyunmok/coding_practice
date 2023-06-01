import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=10; i<=n*10; i=i*10) {
            answer += n%i/(i/10);
        }
        return answer;
    }
}
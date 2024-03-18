import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        List<Integer> judge = new ArrayList();
        for(String dicEach : dic) {
            for(int i=0; i<spell.length; i++) {
                if(!dicEach.contains(spell[i]) || judge.contains(spell[i])) {
                    break;
                } else if(i == spell.length-1) {
                    answer = 1;
                }
                
            }
        }
        return answer;
    }
}
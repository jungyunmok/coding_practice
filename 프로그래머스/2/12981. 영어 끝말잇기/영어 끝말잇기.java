import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String> wordList = new ArrayList();
        wordList.add(words[0]);
        for(int i=1; i<words.length; i++) {
            String lastWord = wordList.get(wordList.size()-1);
            String recentWord = words[i].substring(0,1);
            if(wordList.contains(words[i]) || !recentWord.equals(lastWord.substring(lastWord.length()-1))) {
                answer[0] = (i+1)%n == 0 ? n : (i+1)%n;
                answer[1] = answer[0] == n ? (i+1)/n : (i+1)/n+1;
                break;
            } else {
                wordList.add(words[i]);
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer;
        List<String> tempList = new ArrayList();
        for(int i=0; i<picture.length; i++) {
            String temp = "";
            for(String str : picture[i].split("")) {
                temp += str.repeat(k);
            }
            for(int j=0; j<k; j++) {
                tempList.add(temp);
            }
        }
        answer = tempList.toArray(new String[0]);
        return answer;
    }
}
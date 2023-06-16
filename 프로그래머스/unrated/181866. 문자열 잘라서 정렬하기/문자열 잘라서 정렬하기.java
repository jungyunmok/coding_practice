import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String str = "";
        for(int i=0; i<myString.length(); i++) {
            if(!myString.substring(i, i+1).equals("x")) {
                str += myString.substring(i, i+1);
            } else if(!str.equals("")) {
                list.add(str);
                str = "";
            }
        }
        if(!str.equals("")) {
            list.add(str);
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}
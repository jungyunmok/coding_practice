import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        for(String str : my_string.split("")) {
            if(Pattern.matches("[0-9]", str)) {
                temp += str;
            } else if(temp.length() > 0) {
                answer += Integer.parseInt(temp);
                temp = "";
            }
        }
        if(temp.length() > 0) {
            answer += Integer.parseInt(temp);
        }
        return answer;
    }
}
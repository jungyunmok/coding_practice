class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;
        int length = s + overwrite_string.length();
        if(length < my_string.length()) {
            answer += my_string.substring(length);
        }
        return answer;
    }
}
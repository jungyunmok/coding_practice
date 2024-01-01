class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i=0; i<s; i++) {
            answer += my_string.substring(i, i+1);
        }
        for(int j=e; j>=s; j--) {
            answer += my_string.substring(j, j+1);
        }
        if(e+1 < my_string.length()) {
            for(int k=e+1; k<my_string.length(); k++) {
            answer += my_string.substring(k, k+1);
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++) {
            String temp = rsp.substring(i, i+1);
            answer += temp.equals("2") ? "0" : (
                temp.equals("0") ? "5" : "2");
        }
        return answer;
    }
}
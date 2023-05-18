class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.replaceAll("[a-zA-Z]", "").length(); i++) {
            answer += Character.getNumericValue(my_string.replaceAll("[a-zA-Z]", "").charAt(i));
        }
        return answer;
    }
}
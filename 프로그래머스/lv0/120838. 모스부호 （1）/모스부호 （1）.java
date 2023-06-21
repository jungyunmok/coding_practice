class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] mStr = letter.split(" ");
        for(String str : mStr) {
            for(int i=0; i<morse.length; i++) {
                if(str.equals(morse[i])) {
                    answer += Character.toString(i + 97);
                }
            }
        }
        return answer;
    }
}
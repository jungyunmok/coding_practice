class Solution {
    public String solution(int age) {
        String answer = "";
        for(int i=10; i<=age*10; i=i*10) {
            char prefix = (char)(age%i/(i/10)+97);
            answer = prefix + answer;
        }
        return answer;
    }
}
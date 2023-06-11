class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", myString.length());
        int[] answer = new int[str.length];
        int index = 0;
        for(String s : str) {
            answer[index] = s.contains("x") ? 0 : s.length();
            index++;
        }        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] temp1 = my_string.split("");
        String[] temp2 = my_string.split("");
        for(int[] query : queries) {
            int lastIndex = query[1];
            for(int i=query[0]; i<=query[1]; i++) {
                temp1[i] = temp2[lastIndex];
                lastIndex--;
            }
            temp2 = temp1.clone();
        }
        answer = String.join("", temp1);
        return answer;
    }
}
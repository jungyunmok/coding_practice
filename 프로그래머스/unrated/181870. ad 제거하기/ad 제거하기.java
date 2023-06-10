class Solution {
    public String[] solution(String[] strArr) {
        int length = strArr.length;
        for(String str : strArr) {
            if(str.contains("ad")) {
                length--;
            }
        }
        String[] answer = new String[length];
        int index = 0;
        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answer[index] = strArr[i];
                index++;
            }
        }
        return answer;
    }
}
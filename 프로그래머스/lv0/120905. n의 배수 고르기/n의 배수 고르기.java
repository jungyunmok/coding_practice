class Solution {
    public int[] solution(int n, int[] numlist) {
        int temp[] = new int[numlist.length];
        int length = 0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n == 0) {
                temp[i] =  numlist[i];
                length++;
            }
        }
        int[] answer = new int[length];
        int index = 0;
        for(int j=0; j<temp.length; j++) {
            if(temp[j] > 0) {
                answer[index] = temp[j];
                index++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers.length > k*2-1 ? k*2-1 : 
        (k*2-1)%numbers.length == 0 ? numbers[numbers.length-1] : (k*2-1)%numbers.length;
        
        return answer;
    }
}
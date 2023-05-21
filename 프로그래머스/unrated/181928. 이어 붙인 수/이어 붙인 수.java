class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int num : num_list) {
            odd += num%2 != 0 ? num : "";
            even += num%2 == 0 ? num : "";
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}
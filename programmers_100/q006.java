package programmers_100;

// 나머지 구하기
public class q006 {
  public int solution1(int num1, int num2) {
    int answer = num1 % num2;
    return answer;
  }

  // 다른 풀이
  public int solution2(int num1, int num2) {
    // while사용으로 나눗셈 반복연산 대신함
    while (num1 >= num2) {
      num1 = num1 - num2;
    }
    // 더 이상 나눠질 수 없다면 answer에 대입
    int answer = num1;
    return answer;
  }
}
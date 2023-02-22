package programmers_100;

// 두 수의 나눗셈
public class q008 {
  public int solution1(int num1, int num2) {
    int answer = 0;
    if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
      double temp = (double) num1 / num2;
      answer = (int) (temp * 1000);
    }
    return answer;
  }

  // 다른 풀이
  public int solution2(int num1, int num2) {
    double result = (double) num1 / (double) num2;
    return (int) (result * 1000);
  }
}
package programmers_100;

// 짝수의 합
public class q011 {
  public int solution1(int n) {
    int answer = 0;
    if (n > 0 && n <= 1000) {
      for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
          answer += i;
        }
      }
    }
    return answer;
  }

  // 다른 풀이
  public int solution2(int n) {
    int answer = 0;
    // 짝수의 합이니 2부터 시작, 2씩 증가시켜줌
    for (int i = 2; i <= n; i += 2) {
      answer += i;
    }
    return answer;
  }
}

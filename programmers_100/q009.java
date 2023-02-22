package programmers_100;

// 각도기
public class q009 {
  public int solution1(int angle) {
    int answer = 0;
    if (angle > 0 && angle < 90) {
      answer = 1;
    } else if (angle == 90) {
      answer = 2;
    } else if (angle < 180) {
      answer = 3;
    } else if (angle == 180) {
      answer = 4;
    }
    return answer;
  }

  // 다른 풀이
  public int solution2(int angle) {
    // 180이면 4 -> 아닐경우 90미만이면 1 -> 아닐경우 90이면 2 -> 아닐경우 90이상이면 3 -> 아닐 경우 0
    // angle이 0이 아니라는 if문으로 먼저 걸러줘야 2번째 90미만 조건에 0이 걸리지 않을듯
    return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
  }
}

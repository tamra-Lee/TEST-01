package condition;
//if~else
//정수 num의 결과 짝수, 홀수
public class IF9 {
  public static void main(String[] args) {

    int num=15;

    if (num%2==0) {//값이 2로 나눈 나머지가 0이면 짝수, &는 나머지갑, ==같다
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}

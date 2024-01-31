package loopcon;

public class For5 {
  public static void main(String[] args) {

    // 1. 1부터 35까지 짝수의 합을 구하시오 +for
    //    1부터 35까지의 짝수 합 : xx

    // 2. 0부터 50까지 홀수의 합을 구하시오 +for
    //    0부터 50까지의 홀수 합 : xx


    //1.
    int sum1 = 0, sum2 = 0;
    for (int i = 1; i <= 35; i++) {
      if (i % 2 != 1) {
        sum1 += i;
        System.out.println("1~35까지 짝수의 합: " + sum1);
      }//for end
    }

    System.out.println();
    System.out.println();


    //2.
    for (int i = 0; i <= 50; i++) {
      if (i % 2 == 1) {
        sum2 += i;
        System.out.println("0부터 50까지 홀수의 합: " + sum2);
      } //if end
    } //for end

  }
}
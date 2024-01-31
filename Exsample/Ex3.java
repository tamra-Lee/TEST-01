package Exsample;

public class Ex3 {
  public static void main(String[] args) {

    // while문
    // 1부터 10까지의 합 구하기

    int i=1, max=10, sum=0; //i변수에 1을 대입
    while (i<=max){

      // 1. 실행문, 출력문
      sum += i;
      System.out.println("합:" +sum);

      // 2. 증감식
      i++;

    } // end while


  }//
}

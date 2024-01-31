package loopcon;

public class Test {
  public static void main(String[] args) {

    /*
    * 1. for : 횟수가 정해져 있을때('몇번' 반복하시오~)
    * 2. while : 무한반복 + if + break : 무한으로 반복하고, 조건을 만족하면 멈추시오
         => 아이디,비번 로그인 / 게임 exit하면 중단 / 메뉴선택 할때 사용
    * 3. do ~ while : 조건에 만족하지 않아도 무조건 한번은 실행


    1. for문 : 몇번 반복해
    for(초기값; 조건식; 증감식){
    실행문;
    }
    * 조건식: ~까지, 관계연산자 true/false
    * 증감식: ++변수, --변수
    *

    for(int unm=0) {

      num++;
      System.out.println("현재값:" + num);
      num++;
      System.out.println("현재값:" + num);
      num++;
      System.out.println("현재값:" + num);
      num++;
      System.out.println("현재값:" + num);
    }

     */



    /*
    * 1~4까지 출력 예제
    * 반복횟수:i가 1부터 4까지 1씩 증가
    * 규칙성:숫자1~4
    * 반복횟수는 초기화, 조건식, 증감식 결정
    * 규칙성은 실행문을 결정
    */

    for (int i=1; i<=8; i++) {
      System.out.println("현재값:" +i);
    }


  }
}

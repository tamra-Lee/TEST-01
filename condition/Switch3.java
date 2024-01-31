package condition;

public class Switch3 {
  /*
   * 회원등급쿠폰 발급
   * 회원등급(1,2,3 => grade)
   * 쿠폰:coupon
   * 1등급:쿠폰 3000원
   * 2등급:쿠폰 2000원
   * 3등급:쿠폰 1000원
   * 그외:쿠폰 500원
   *
   * 변수 선언 정수형:초기값 선언하는것이 좋다
   * 자바:처음 실행 모두 처리한 후 실행 에러의 경우의 수가 없어야한다
   */

  public static void main(String[] args) {

    //if문 조건관계, 비교+산술 등 -  true/false
    //~같다:분기형 switch~case문 처리속도가 빠르다

    int coupon, grade=3;

    switch (grade) {//switch(변수)
      case 1: //grade가 1과 같으면, if(grade==1)
        coupon = 3000;
        break;
      case 2:
        coupon = 2000;
        break;
      case 3:
        coupon = 1000;
        break;
      default:
        coupon = 500;
    }

    System.out.println(grade+"등급, 쿠폰"+coupon);

  }

}



/*
  public static void main(String[] args) {

    int coupon, grade=10;

    if (grade==1){
      coupon=3000;
    } else if (grade==2) {
      coupon=2000;
    } else if (grade==3) {
      coupon=1000;
    } else {coupon=500;}
    System.out.println(grade+"등급/쿠폰발급:"+coupon+"원");
  }



  ---------------------------------------------------------

    public static void main(String[] args) {

    int coupon=500, grade=2;

    if (grade>=1 && grade<=3){
      System.out.println(grade+"등급/쿠폰발급:"+coupon+"원");
  }else {
      System.out.println("해당등급은 쿠폰:"+coupon+"원");}
  }


  */
package operator;


public class Oper8 {
  public static void main(String[] args) {
    String name="홍길동";
    int kor=100, eng=80, mat=75;
    int sum=0;
    double avg=0.0;

    //재할당
    sum=kor+eng+mat;
    avg=(double) sum/3.0;

    //출력
    System.out.println("이름:"+name);
    System.out.println("국어점수:"+kor);
    System.out.println("영어점수:"+eng);
    System.out.println("수학점수:"+mat);
    System.out.println("총점:"+sum);
    System.out.println("평균:"+avg);


    //비교연산자
    System.out.println("&&:AND 연산자");
    System.out.println("true&&true");
    System.out.println("true&&false");
    System.out.println("false&&false");

    System.out.println("||:OR 또는 연산자");
    System.out.println("true||true");
    System.out.println("true||false");
    System.out.println("false||false");

    System.out.println("!:not 부정 연산자");
    System.out.println("!true");
    System.out.println("!falsee");


    System.out.println("변수+논리 연산자");
    boolean a= true;
    boolean b= false;
    System.out.println(a&&b);
    System.out.println(a||b);
    System.out.println(!a);
    System.out.println(!b);




    System.out.println("논리 연산자 응용");
    int x=25;
    boolean result; //x가 10보다 크고 20보다 작다 => 결과 : true or false 가 나와야함

    //result=x>10 && x<20;
    //크다,작다:비교연산자
    // ~이고,~또는:논리연산자
    result=(x>10) && (x<20);

    System.out.println("결과:"+result);


    System.out.println("논리연산자 응용2");
    int score=50;
    boolean result1;
    result1=(score>=80) && (score<=100);

    System.out.println("결과:"+result1);



  }
}

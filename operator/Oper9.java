package operator;

public class Oper9 {
  public static void main(String[] args) {

    //증감연산자
    //++(--)변수:전위형=더하기먼저 그후에 대입
    //변수(--)++:후위형=대입먼저, 그후에 더하기

    int x=1;
    int y=0;

    y=++x; //x값 1증가 먼저시키고 그 결과값을 y에 대입

    System.out.println("x:"+x + ", y:"+y);



    int a=1;
    int b=0;

    b=a++; //a를 b에 먼저 대입시키고, 그후 b값 1증가

    System.out.println("a:"+a + ", b:"+b);

  }
}

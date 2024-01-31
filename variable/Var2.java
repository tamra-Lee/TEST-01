package variable;

public class Var2 {
  public static void main(String[] args) {
    int a = 10; //선언과 동시에 초기화
    int b = 20;
    int c = 50;
    int d = 100;

    //출력("문자열" + 변수) + : 연결

    //재할당 - 값을 다시 변경
    a=100;
    b=200;
    c=500;


    //재선언할수 없다
    //int a = 500;

    System.out.println("a:" + a);
    System.out.println("b:" + b);
    System.out.println("c:" + d);
    System.out.println("d:" + c);


  }
}

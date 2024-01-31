package Exsample;

import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int num1=0, num2=0, num3=0, result=0;
    String op="";

    System.out.println("***************************************");
    System.out.println("계산기만들기");
    System.out.println("***************************************");

    while (true){
      System.out.print("정수1 : ");
      num1=scanner.nextInt();
      System.out.print("정수2 : ");
      num2=scanner.nextInt();
      System.out.println("연산자 선택 : 종료 : end , +, -, *, /, %");
      System.out.print("선택 :  ");

      scanner.nextLine();
      op=scanner.nextLine();

      if (op.equals("end")){
        System.out.println("계산기 프로그램 종료"); break;
      }


      switch (op){
        case "+": result=num1+num2; break;
        case "-": result=num1-num2; break;
        case "*": result=num1*num2; break;
        case "/": result=num1/num2; break;
        case "%": result=num1%num2; break;
        default:
          System.out.println("잘못된 연산자 입니다");
      }//스위치끝

      if (op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%")) {
        System.out.println(num1 + op + num2 + "=" + result);
      } //이프끝

    }//와일끝

  }//

}
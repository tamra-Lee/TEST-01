package Exsample;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int num1=0, num2=0, num3=0, result=0;
    String op="";
    System.out.println("계산기만들기");

    while (true){
      System.out.print("정수1 : ");
      num1=scanner.nextInt();
      System.out.print("정수2 : ");
      num2=scanner.nextInt();
      System.out.println("연산자 선택 : 종료 : 0 , 1:+, 2:-, 3:*, 4:/, 5:%");
      System.out.print("선택 :  ");
      num3=scanner.nextInt();
      if (num3==0){
        System.out.println("계산기 프로그램 종료"); break;
      }

      switch (num3){
        case 1:
          result=num1+num2;
          op="+"; break;
        case 2:
          result=num1-num2;
          op="-"; break;
        case 3:
          result=num1*num2;
          op="*"; break;
        case 4:
          result=num1/num2;
          op="/"; break;
        case 5:
          result=num1%num2;
          op="%"; break;
        default:
          System.out.println("잘못된 연산자 입니다");
      }//스위치끝

      if (num3>=1 && num3<=5) {
        System.out.println(num1 + op + num2 + "=" + result);
      } //이프끝

    }//와일끝

  }//
}

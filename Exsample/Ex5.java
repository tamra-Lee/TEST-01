package Exsample;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in); //선언
    int num=0; //초기값 0 선언

    System.out.print("값을 입력하세요 : "); //출력
    num=scanner.nextInt(); //출력값

    if (num%2==0){
      System.out.println("입력한 정수 " + num + "은 짝수 입니다.");
    } else {
      System.out.println("입력한 정수 " + num + "은 홀수 입니다.");
    }


  }
}

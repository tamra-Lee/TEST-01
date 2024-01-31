package Exsample;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {

    //scanner
    //키보드로부터(외부로부터) 이름과 나이를 입력받기

    Scanner scanner = new Scanner(System.in);
    String name = "";
    int age = 0;

    System.out.print("이름을 입력하세요 : ");
    name=scanner.nextLine();  //console 대기(공백,여백 만들기)

    System.out.print("나이를 입력하세요 : ");
    age=scanner.nextInt();

    System.out.print("당신의 이름은" +name+ "이고, 나이는 " +age+ "살 입니다.");



  }
}

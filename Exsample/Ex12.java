package Exsample;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String grade="", result="";

    System.out.print("점수를 입력하세요 : ");
    grade=scanner.nextLine();
    result=switch(grade){
      case "A"->"최고점수";
      case "B"->"시험에 통과";
      case "C"->"노력이필요";
      case "D"->"재시험";
      case "E"->"불합격. 재시험불가";
      default -> "잘못된 학점";
    };//스위치끝

    System.out.println(result);




  }
}



/*

package Exsample;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String grade="";

    System.out.print("점수를 입력하세요 : ");
    grade=scanner.nextLine();

    switch(grade){
      case "A": System.out.println("최고점수"); break;
      case "B": System.out.println("시험에 통과"); break;
      case "C": System.out.println("노력이필요"); break;
      case "D": System.out.println("재시험"); break;
      case "E": System.out.println("불합격. 재시험불가"); break;
      default: System.out.println("잘못된 학점");


    }//스위치끝




  }
}


* */
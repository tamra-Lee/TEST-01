package Exsample;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int score=0;
    String hak="";


    System.out.print("점수를 입력하세요 : ");
    score=scanner.nextInt();

    System.out.println("================================");

    if (score>=90){
      hak="A";
    } else if (score>=80){
      hak="B";
    } else if (score>=70){
      hak="C";
    } else if (score>=60){
      hak="D";
    } else {
      hak="F";
    }

      System.out.println("학점은 [" +hak +"]입니다.");



  }//
}



/*
public class Ex10 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int score=0;

    System.out.print("점수를 입력하세요 : ");
    score=scanner.nextInt();

    System.out.println("================================");

    if (score>=90){
      System.out.println("90점 이상 학점은 [A] 입니다.");
    } else if (score>=80) {
      System.out.println("80점 이상 학점은 [B] 입니다.");
    } else if (score>=70) {
      System.out.println("70점 이상 학점은 [C] 입니다.");
    } else if (score>=60) {
      System.out.println("60점 이상 학점은 [D] 입니다.");
    } else {
      System.out.println("학점은 F입니다.");
    }


  }//
}

*/
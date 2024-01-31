package Exsample;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

    int [] korScores;
    int sum=0, avg=0;
    korScores=new int[5];

    for (int i=0; i<korScores.length; i++){
      System.out.print("학생" +(i+1) +"번의 국어 : ");
      korScores[i] = scanner.nextInt();
      sum +=korScores[i];
    }

    for (int i=0; i<korScores.length; i++){
      System.out.println("korScore["+i+"] : " +korScores[i]);
      avg=sum / korScores.length;
    }

    System.out.println("학생" +korScores.length +"명의 국어점수는" +sum +"이고");
    System.out.println("반 국어점수 평균은" +avg +"입니다");

  }//
}

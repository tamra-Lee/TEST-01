package loopcon;

import java.util.Scanner;

public class For7 {
  public static void main(String[] args) {

    int dan=3, result=0;

    Scanner scanner=new Scanner(System.in);
    System.out.print("단 : ");
    dan=scanner.nextInt();

    System.out.println();
    System.out.println("========== [ "+dan+"단 ] ==========");
    for (int i=1; i<=9; i++){
      result=dan*i;
      System.out.println(dan +"X" +i +"=" +result);
    }




  }//
}

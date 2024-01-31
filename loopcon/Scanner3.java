package loopcon;

import java.util.Scanner;

public class Scanner3 {
  public static void main(String[] args) {

    int num1, num2, num3='0', sum=0;
    String result;

    Scanner scanner = new Scanner(System.in);
    System.out.println("정수1: ");
    num1=scanner.nextInt();
    System.out.println("정수2: ");
    num2=scanner.nextInt();

    sum=num1-num2;
    System.out.println("합: "+sum);




  }//
}

package Exsample;

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int max=0, sum=0;

    System.out.print("숫자를 입력하세요 : ");
    max=scanner.nextInt();
    for (int i= 0; i<=max; i++){
      if (i%2==0){
        sum+=i;
      }
    }

    System.out.print("짝수의 총 합은 [" +sum +"] 입니다");



  }
}

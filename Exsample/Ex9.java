package Exsample;

import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int price, age, discount=0;

    System.out.print("구매가격 : ");
    price=scanner.nextInt();

    System.out.print("나이 : ");
    age=scanner.nextInt();

    System.out.println("================================");

    if (price >= 10000 && age <=10){
      discount += 2000;
      System.out.println("10000원 이상 구매, 1000원 할인");
      System.out.println("어린이는 1000원 할인");
    } else if (price >= 10000 && age>10) {
      discount += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    } else {
      discount=0;
      System.out.println("1000원 할인 불가능");
    }

    System.out.println("총 할인 금액 : " +discount +"원");

  }
}

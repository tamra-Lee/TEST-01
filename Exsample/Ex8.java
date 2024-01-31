package Exsample;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int price, age, discount=0;

    System.out.print("구매가격 : ");
    price=scanner.nextInt();

    System.out.print("나이 : ");
    age=scanner.nextInt();

    System.out.println("============================");

    if (age<=10||price<=10000){
      discount += 2000;
    } if (age>10||price<=10000){
      discount +=1000;
    }
    System.out.print("할인금액 : " +discount +"원");


  }
}



/*

public class Ex8 {
  public static void main(String[] args) {

    int price, age, discount=0;
    price=15000;
    age=10;


    if (price >= 10000){
      discount +=1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    }

    //나이
    if (age <=10){
      discount +=1000;
      System.out.println("어린이는 1000원 할인");
    }

    System.out.println("============================");
    System.out.println("총 할인 금액 : " +discount +"원");





  }
}

*/

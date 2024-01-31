package Exsample;

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String name="";
    int price=0, quant=0, total=0;

    System.out.print("주문음식 : ");
    name=scanner.nextLine();

    System.out.print("주문가격 : ");
    price=scanner.nextInt();

    System.out.print("주문수량 : ");
    quant=scanner.nextInt();

    total=price*quant;

    System.out.println();
    System.out.println("--------------------------");
    System.out.println();

    System.out.println("주문음식 : "+name);
    System.out.println("주문가격 : "+price +"원");
    System.out.println("주문수량 : "+quant +"개");
    System.out.println("==========================");
    System.out.println("총 주문 금액 : "+total +"원");
  }
}

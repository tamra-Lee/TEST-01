package loopcon;

import java.util.Scanner;

public class For10 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int money=0, in=0, out=0;
    int num=0;

    while (true){
      System.out.println();
      System.out.println("-----------------------------");
      System.out.println("1.예금  2.출금  3.잔고  4.종료");
      System.out.println("-----------------------------");
      System.out.println();
      System.out.print("선택> ");
      num=scanner.nextInt();

      if (num==1){
        System.out.print("입금액> ");
        in=scanner.nextInt();
        money+=in;
      }

      if (num==2){
        System.out.print("출금액> ");
        out=scanner.nextInt();
        // if는 양수 이어야함 (양수-음수:대출)
        money-=out;
      }

      if (num==3){
        System.out.print("잔고> " +money +"원");
        System.out.println();
      }

      if (num==4){
        System.out.println();
        System.out.print("******* 은행프로그램 종료 *******");
        System.out.println();
        System.out.println();
        System.out.println();
        break;
      }

      if (num>4){
        System.out.print("선택범위 초과 / 다시 입력하세요");
      }
    }//와일끝


  }//
}

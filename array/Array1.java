package array;

public class Array1 {
  public static void main(String[] args) {

    //음식주문 - 문자열
    //배열선언:타입이 동일한 연속공간 선언

    //String foods[]=new String[5];
    //String[] foods=new String[5];

    String[] foods=new String[]{"라면","우동","김밥","돈까쓰","떡볶이"};
//  String[] foods={"라면","우동","김밥","돈까쓰","떡볶이"};
    // → 값이 간단하면 초기화


    //다른자료형
    int[] x= new int[3];
    x[0]=10;
    x[1]=10;
    x[2]=10;

    double[] d=new double[] {10.2, 11.6, 20.33};

    boolean[] b={true, false, true};




  }//
}




/*

#STEP1
변수로처리할경우

    String food1="라면", food2="우동", food3="김밥", food4="돈까쓰", food5="떡볶이";

    System.out.println(food1 +" 하나 주문");
    System.out.println(food2 +" 하나 주문");
    System.out.println(food3 +" 하나 주문");
    System.out.println(food4 +" 하나 주문");
    System.out.println(food5 +" 하나 주문");
    System.out.println(" 하겠습니다. 주문완료");

--------------------------------------------------------------------

#STEP2
주문자가 30일때? 불필요한코드가 너무많으니까 배열로!

    String foods[]=new String[5];    // = String[] foods=new String[5];

    foods[0]="라면";
    foods[1]="우동";
    foods[2]="김밥";
    foods[3]="돈까쓰";
    foods[4]="떡볶이";

    System.out.println(foods[0] +" 하나 주문");
    System.out.println(foods[1] +" 하나 주문");
    System.out.println(foods[2] +" 하나 주문");
    System.out.println(foods[3] +" 하나 주문");
    System.out.println(foods[4] +" 하나 주문");
    System.out.println("하겠습니다. 주문완료");

----------------------------------------------------------------------

    String foods[]=new String[5];    // = String[] foods=new String[5];

    foods[0]="라면";
    foods[1]="우동";
    foods[2]="김밥";
    foods[3]="돈까쓰";
    foods[4]="떡볶이";

    for (int i=0; i<4; i++) {
      System.out.println(foods[i] +"하나 주문");
    }
    for (int i=0; i<foods.length; i++) {
      System.out.println(foods[i] +"하나 주문");
    }

*/
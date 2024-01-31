package Exsample;

public class Ex2 {
  public static void main(String[] args) {

    // 1부터 20까지의 합 구하기 : for문 사용
    int sum= 0, max=20;
    for (int i=1;i<=max; i++){
      sum += i;
      System.out.println("sum:" +sum);
    }

  }//
}





/*

public class Ex2 {
  public static void main(String[] args) {

//for문
    for (int i=1, num=2; i<=10; i++, num+=2){
      System.out.println(", "+i+"/ num:"+num);
    }//end for

  }//
}

---------------------------------------------------------

public class Ex2 {
  public static void main(String[] args) {

    // 1부터 20까지의 합 구하기 : for문 사용
    int sum= 0, max=20;
    for (int i=1;i<=max; i++){
      sum += i;
      System.out.println("sum:" +sum);
    }

  }//
}


*/
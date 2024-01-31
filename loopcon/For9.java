package loopcon;

public class For9 {
  public static void main(String[] args) {

    //구구단

    int result=0;
    for (int i=2; i<=9; i++){
      System.out.println("====" +i +"단 ====");
      for (int j=1; j<=9; i++){
        result=i*j;
        System.out.println(i +"X" +j +"=" +result);
      }
      System.out.println();
      System.out.println();
    }

  }//
}

package condition;

public class Switch6 {
  public static void main(String[] args) {

    //짝수, 홀수? : if, 삼항을 쓰는게 좋다
    int num =2;
    switch (num%2){
      case 0:
        System.out.println("짝수");
        break;
      default:
        System.out.println("홀수");
    }

  }
}

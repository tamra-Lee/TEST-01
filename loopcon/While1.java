package loopcon;

public class While1 {
  public static void main(String[] args) {

    //무한루프처리할때 많이 사용한다
    //1~10 합
    //총합:xx

    int x = 0, sum = 0;
    while (x <= 30) {
      if (x%2==0) {
        sum += x;
        }
        x++;
      }
      System.out.println("총합:" + sum);
    }
  }




/*
*   public static void main(String[] args) {

    //무한루프처리할때 많이 사용한다
    int x=0; //초기값;
    while (x<10){ //(조건식)
      System.out.println("현재값:" +x); //실행문
      x++; //증감식
    }
  }
 */
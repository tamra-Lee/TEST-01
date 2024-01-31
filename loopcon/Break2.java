package loopcon;

public class Break2 {
  public static void main(String[] args) {

    //while 무한루프 true
    //x가 10이 넘으면 중단해라
    int x=0;
    while (true){
      System.out.println(x);
      if (x==15){
        break;
      }//ei
      x++;
    }//eh


  }//
}

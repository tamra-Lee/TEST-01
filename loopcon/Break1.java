package loopcon;

public class Break1 {
  public static void main(String[] args) {

    //반복문 안에 특정 조건을 만나면 중단
    //for+if+break : 횟수,개수가 지정되어있을때 사용
    //while+if+break : 무한루프 중단처리할때 사용

    //1부터 10까지 반복처리(for), 5가되면 중단.
    for (int i=1; i<10; i++){
      System.out.println(i);
      if (i==8){
        break;
      }//if end//
    }//for end//


  }//
}

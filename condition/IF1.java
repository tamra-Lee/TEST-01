package condition;

public class IF1 {
  public static void main(String[] args) {

    //단일 if문
    /* if(조건식) 참결과 1개
       if(조건식) {참결과 참결과 참결과} */



    // 점수 변수의 값이 80이상이면 합격, 미만이면 불합격

    int score = 75;


    //조건 if문

    if(score>=80) { //점수가 80보다 크면
      System.out.println(("합격"));  //참결과
    }

    if(score<80){
      System.out.println("불합격");
    }




  }
}

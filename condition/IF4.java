package condition;

public class IF4 {
  public static void main(String[] args) {

    int score = 45; // 초기값 - 변경되는값

    if (score < 60) {
      System.out.println("재시험");
    } // end if
    if (score <= 70) {
      System.out.println("경고");
    }// end if
    if (score <= 80) {
      System.out.println("통과");
    }// end if
    if (score <= 100) {
      System.out.println("1학기 프리패스");
    }// end if

  }
}





/*

int score=90;

    if(score<60){
      System.out.println("재시험");
    }
    if (score>=60&&score<70){
      System.out.println("경고");
    }
    if (score>=70&&score<80){
      System.out.println("통과");
    }
    if(score>=80&&score<=100){
      System.out.println("1학기 프리패스");
    }

*/
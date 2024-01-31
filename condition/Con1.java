package condition;

// 삼항연산자
// 형식 => (조건)?참결과:거짓결과
// if~else 를 삼항으로 바꿔서 쓸수있다

public class Con1 {
  public static void main(String[] args) {

    int age=20;
    String result=(age>=18) ? "성년":"미성년";
    System.out.println(result);

    int x=3;
    String result1=(x%2==0) ? "짝수":"홀수";
    System.out.println(result1);

    int score=50;
    String result2=(score>=80) ? "합격":"불합격";
    System.out.println(result2);


  }
}

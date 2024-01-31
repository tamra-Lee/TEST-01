package operator;
/*이름, 국어점수, 영어점수, 수학점수의 합계와 평균 구하기*/
//name, kor, eng, mat, sum, avg
//name:문자열, kor:정수, eng:정수, mat:정수, sum:정수, avg:실수

//이름:홍길동
//국어점수: xx
//영어점쉬: xx
//수학점쉬: xx
//세과목 총점: xx
//세과목 평균: xx

public class Oper7 {
  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int mat = 85;
    int sum = kor+eng+mat;
    double avg = sum/3;

    System.out.println("이름:"+name);
    System.out.println("국어점수:"+kor);
    System.out.println("영어점수:"+eng);
    System.out.println("수학점수:"+mat);
    System.out.println("총점:"+sum);
    System.out.println("평균:"+avg);
  }
}

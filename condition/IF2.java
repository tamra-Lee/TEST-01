package condition;

public class IF2 {
  public static void main(String[] args) {

    //단일 if문
    //나이가(age) 20 이상이면 성인
    //나이가(age) 18 미만이면 미성년

    int age=20;

    if(age>=20) {
      System.out.println("성인");
    }

    if(age<18) {
      System.out.println("미성년");
    }
  }
}

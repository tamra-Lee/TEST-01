package condition;

public class IF13 {
  public static void main(String[] args) {

    int age = 14;
    String addr = "인천";

    if (age >= 16 && addr .equals("인천")) {
      System.out.println("가입가능");
    } else {
      System.out.println("가입 불가능");
    }
  }
}
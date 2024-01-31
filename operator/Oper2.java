package operator;

  // +연산자는 문자열, 숫자, 변수 등 연결가능
public class Oper2 {
  public static void main(String[] args) {
    String result1 = "test" + "java"; //문자열 연결
    System.out.println(result1);

    String str1="string1";
    String str2="strinf2";
    String result2=str1+str2;
    System.out.println(result2); // string1strinf2

    String str3="a+b";
    int num=30;
    // 숫자+문자열 => 문자열
    String result3=str3+num;
    System.out.println(result3);

  }
}

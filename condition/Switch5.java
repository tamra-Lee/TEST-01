package condition;

//31=1,3,5,7,8,10,12 / 30=4,6,9,11 / 29=2

public class Switch5 {
  public static void main(String[] args) {

    int month=3, day=0;
    
    switch (month){
      case 1,3,5,7,8,10,12 : day=31; break;
      case 4: case 6: case 9: case 11: day=30; break;
      case 2 : day=29; break;
      default:
        System.out.println("해당월은 존재하지 않습니다");
    }

    if (month>=1 && month<=12){
      System.out.println(month+"월은 "+day+"일 까지 입니다.");
    }

  }
}

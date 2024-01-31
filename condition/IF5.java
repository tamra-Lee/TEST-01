package condition;

// 단일if문
/*
* num=0
* 양수입니다
* 음수입니다
* 0입니다
*/

public class IF5 {
  public static void main(String[] args) {

    int num=0;
    if (num>0){
      System.out.println("양수");
    }
    if (num<0){
      System.out.println("음수");
    }
    if (num==0){
      System.out.println("0입니다");
    }

  }
}

// 1. 수업이 끝나고 = if
// 2. 친구를 만나면 = true or false
// 3. 저녁을 먹는다 = result 1개 : 친구를 만나면 저녁을 먹고 안만나면 출력X

// 1. 수업이끝나고
// 2. 친구를 만나면 저녁을먹고
// 3. 아니면 집에간다
/*
if(친구를 만나면){
저녁먹기
}else{
집에간다
}
*/
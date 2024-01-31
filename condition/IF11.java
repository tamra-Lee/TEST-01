package condition;
/*
다중 if문 :
1. if문 여러개 - 결과 여러개일때
2. 동일한 형식의 결과 2개 이상일때
if(조건) 조건필수
결과는 if문 개수 빼기 1

if(조건식1){참결과1} else if(조건식2){참결과2} ... else {그외결과}
*/

//경품추천 - 1:운동화/3:화장품/5:구두/9:상품권/그외:꽝

public class IF11 {
  public static void main(String[] args) {
    int x=4;
    if (x==1){
      System.out.println("운동화");
    }else if (x==3){
      System.out.println("화장품");
    }else if (x==5){
      System.out.println("구두");
    } else if (x==9) {
      System.out.println("상품권");
    } else {
      System.out.println("꽝 다음기회에");
    }
  }
}

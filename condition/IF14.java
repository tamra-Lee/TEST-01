package condition;

public class IF14 {
  public static void main(String[] args) {

    // 소수니까 더블

    //평점별로 추천 프로그램
    //if~else if 문 작은수부터 큰수로 진행 : 같은성격을 비교할경우 사용
    //단일 if문 : 다른성격을 비교할경우 사용
    //변수>=0 && 변수<=5 : 범위
    //(조건)? 참:거짓


    double rating=9;
   // String result=(rating<=7)? "수상한세탁소" : "아쿠아맨";
    String result=(rating<=7)? "수상한세탁소" : (rating<=8)? "아쿠아맨":"서울의봄";
    System.out.println(result+" 추천");
  }

}


/*

public static void main(String[] args) {

    // 소수니까 더블

    //평점별로 추천 프로그램
    //if~else if 문 작은수부터 큰수로 진행 : 같은성격을 비교할경우 사용
    //단일 if문 : 다른성격을 비교할경우 사용


    double rating=7.5;

    if (rating <= 9){
      System.out.println("서울의봄 추천");
    }

    if (rating <=8){
      System.out.println("아쿠아맨 추천");
    }

    if (rating<=7){
      System.out.println("수상한세탁소 추천");
    }
  }


----------------------------------------------------------------

  public static void main(String[] args) {

    // 소수니까 더블

    //평점별로 추천 프로그램
    //if~else if 문 작은수부터 큰수로 진행 : 같은성격을 비교할경우 사용
    //단일 if문 : 다른성격을 비교할경우 사용
    //변수>=0 && 변수<=5 : 범위


    double rating=8.5;

    if (rating <= 8){
      System.out.println("수상한세탁소 추천");
    } else if (rating <= 8){
      System.out.println("아쿠아맨 추천");
    } else if (rating <= 9){
      System.out.println("서울의봄 추천");
    } else {
      System.out.println("랜덤추천");
    }
  }

  */
package loopcon;

public class For6 {
  public static void main(String[] args) {

        for (int i=0; i<=2; i++){
          System.out.println("========== 이중 for문 ==========");
          for (int j=0; j<=2; j++){
            System.out.print("i=" +i + " / j="+j +", ");}
          System.out.println();
    }


  }//
}




/*
for(초기값; 조건식; 증감식){
  for(초기값; 조건식; 증감식){
    실행문
  }
}
         <열j>     <행>  <열>
<행i> 0: 0 1 2     i=0,  j=0
<행i> 1: 0 1 2     i=0,  j=0
<행i> 2: 0 1 2     i=0,  j=0

*/
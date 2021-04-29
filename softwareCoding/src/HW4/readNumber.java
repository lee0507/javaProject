package HW4;

public class readNumber {//클래스 선언

   public static void main(String[] args) {//메인으로부터 프로그램시작
      // TODO Auto-generated method stub
      int k30_iNumVal = 1001034567;// 숫자형 변수 k30_iNumVal을 정의하고 값을 100103456으로 초기화한다.
      String k30_sNumVal = String.valueOf(k30_iNumVal);// 문자열형 변수 k30_sNumVal을 정의하고 값을 문자열로 형변환한 k30_iNumVal으로 초기화한다.
      String k30_sNumVoice = "";//문자열형 변수 k30_sNumVoice를 정의하고 ""로 값을 초기화한다.
      System.out.printf("==> %s [%d자리]\n", k30_sNumVal, k30_sNumVal.length());// %s를 통해 문자열형 k30_sNumVal 값과 %d를 통해 k30_sNumVal의 길이를 화면에 출력한다.
      
      int k30_i, k30_j;//숫자형 변수 k30_i와 k30_j를 정의한다.
      
      String [] k30_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};//문자열형 배열 k30_units을 정의하고 값을 순서대로 저장한다.
      String [] k30_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};//문자열형 배열 k30_unitX을 정의하고 값을 순서대로 저장한다.
      
      k30_i = 0;//변수 k30_i의 값을 0으로 초기화한다.
      k30_j = k30_sNumVal.length() - 1;//변수 k30_j의 값을 k30_sNumVal의 길이 - 1 로 초기화한다.
      
      while (true) {//while 반복문의 조건을 k30_i >=0으로 설정하여 k30_i가 0과 같거나 크다면 반복문이 수행되도록 한다.
         if(k30_i >= k30_sNumVal.length()) break;// 만약 k30_i가 k30_sNumVal의 길이와 같거나 크다면 break문을 수행한다.
         
         System.out.printf("%s[%s]",// %s를 통해 문자열형 k30_sNumVal 값과 %d를 통해 k30_sNumVal의 길이를 화면에 출력한다.
               k30_sNumVal.substring(k30_i, k30_i + 1),//k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른다.
               k30_units[Integer.parseInt(k30_sNumVal.substring(k30_i, k30_i + 1))]);//k30_units의 [숫자형으로 형변환한 (k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값)의 인덱스]를 출력한다.
         
         if(k30_sNumVal.substring(k30_i, k30_i + 1).equals("0")) {//만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 0과 같다면
            if(k30_unitX[k30_j].equals("만") || k30_unitX[k30_j].equals("억")) {//만약 k30_unitX의 [k30_j]인덱스 값이 만이거나 k30_unitX의 [k30_j]인덱스 값이 억이면
               k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_j];//k30_sNumVoice값에 k30_unitX[k30_j]인덱스 값을 저장한다. (k30_sNumVoice += k30_unitX[k30_j]로 바꿔서 작성할 수 있다)
            } else {//만약 if조건을 만족하지 않는다면
               //아무것도 하지않는다.
            }
         } else if (k30_sNumVal.substring(k30_i, k30_i + 1).equals("1") && k30_j > 5) {//추가한 부분으로 //만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 1과 같거나
            k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_j];// k30_j가 5보다 크다면 k30_sNumVoice값에 k30_unitX[k30_j]인덱스 값을 저장한다. 
            //(k30_sNumVoice += k30_unitX[k30_j]로 바꿔서 작성할 수 있다)
            
         } else {//만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 0과 같지 않다면
            k30_sNumVoice = k30_sNumVoice//k30_sNumVoice의 값에 
                  + k30_units[Integer.parseInt(k30_sNumVal.substring(k30_i, k30_i + 1))]//k30_units의 숫자형으로 형변환한 (k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값)의 인덱스]의 값을 더하고
                  + k30_unitX[k30_j];//k30_unitX[k30_j]의 값을 더한다.
         }
         k30_i++;//k30_i의 값을 1 증가시킨다.
         k30_j--;//k30_j의 값을 1 감소시킨다.
      }
      System.out.printf("\n %s[%s]\n", k30_sNumVal, k30_sNumVoice);//변수 k30_sNumVal과 k30_sNumVoice의 값을 화면에 출력한다.
   }
}	

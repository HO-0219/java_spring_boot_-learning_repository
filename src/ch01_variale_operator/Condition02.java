package ch01_variale_operator;
import java.io.*;
public class Condition02 {
    static void main() {

        //2개의 숫자중 큰수 고르기
        int a = 10  , b = 30;
        //type 변수 = 조건식 ? 참 : 거짓
        //근데 이걸 여기서?.... 아니.. if, switch, function, for, while, 등 안나가고 ?
        String r = a == b ? "a == b" : a > b ? " a > b " : " a < b ";
        // 이렇게 중첩 해서 사용 할 수 있따~~
        System.out.println(r);

        int r2 = a > b ? a : b ;
        System.out.println(a + " 와 " + b + " 중 더 큰수는 : " + r2 );

        if(a>b) System.out.println("더 큰수는" + a);
        else System.out.println(" 더 큰수는 " + b);

        r = ( a % 2 ) == 0 ? " 짝 " : " 홀 " ;
        System.out.println(r);

        if ( a % 2 == 0) System.out.println( " 짝 " );
        else System.out.println( " 홀 " );

        System.out.println( ( a % 2 ) == 0 ? " 짝 " : " 홀 ");
        a = 6;
        //x 가 3의 배수 이면 제곱 아니면 더하기
        System.out.println( ( a % 3) == 0 ? a*a : 3+5);

        int m = 3;
        System.out.println( m >= 3 && m < 6 ? " 봄 " : m >= 6 && m <10 ? "여름" : m >=10 && m <12 ? "가을" : "겨울");

    }
}

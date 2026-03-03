package ch01_variale_operator;


public class Operator01 {
    static void main(String[] args) {
        int a = 10;
        int b= 8;
        boolean b1 = a!= b ;
        boolean b2 = --a == b++;

        boolean b3 = a++ != --b;

        boolean b4 = b3 && (5>7) ;
        boolean b5 = !b4 || (b1 && b2);
        System.out.println("b1 : "+ b1);
        System.out.println("b2 : "+ b2);
        System.out.println("b3 : "+ b3);
        System.out.println("b4 : "+ b4);
        System.out.println("b5 : "+ b5);
        //3개의 정수중에서 가장 큰 숫자를 구해 봅시다

        int x =5  , y= 6 , z= 10 ;
        // x > y ?  , x> z ?
        int max =x ;
        max = max > y ? max : y ;
        max = max > z ? max : z ;
        System.out.println("가장큰수 " +  max );

        //출력 결과에 대한 변ㅅ수들의 값의 추이를 메모장에
        //  a = 3--2 , b=3  x a>=b ? 5 : a+2
        // x += ++a;  y ++a  y+=a + --b
        char ch3 = 'D';
        //대문자면 --y 소문자 또는 그외 문자면 x+2
        a= 5 ; // a =5
        b= 3; // b =3
        x = 5 >= 3? 5: 5+2; // x 는 5 가 큼 참 으로 5 인 5이 들어감

        a= 3 - -2 ;
        // a에는 3 - -2 로 5가 들어가고
        b =3; // b 는 3이 됨
        x += ++a; // x = x+ a는 증감식에 의해 6이 되어 5+6 으로 11이 됨
        //a = 6 으로 바뀜
        y = ++a;
        //y = 6에서 증감식에 의해 7이 된 값이 들어감 y=  7
        y+= a+ --b;
        // y =7 + 7 + 2 b=2 가됨 14 + 2 임으로 16이 됨
        char c3 = 'D';
        z = c3 >='A' && c3 <= 'Z' ? --y : x+2;
        //D는 대문자로 --y가 실행됨 1가 됨
        int re = 0;
        re = x>y ? z-y : x+z;
        //ㅌ = 11 > 15 거짓이기에 11 +15 가 실행이 됨
        System.out.println(re);


    }

}

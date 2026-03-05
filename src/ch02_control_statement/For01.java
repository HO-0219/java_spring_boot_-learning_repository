package ch02_control_statement;

import java.util.Scanner;

public class For01 {
    static void main() {
        int total =0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
           // System.out.print("숫자 입력 : ");
            //total += s.nextInt();
        }

        System.out.println(total);
        total =0;
        for (int i = 0; i <= 100 ; i++) {
            total += i;
        }
        System.out.println( total);
        int  a= 0 ;
        // 97 -> 92
        for (int i = 97; i >= 2  ; i-=5) {
            a+= i;
        }
        System.out.println(a);
        a = 0;
        for (int i = 1; i <97 ; i+=5) {
            a+= (int) Math.pow(i,2);
        }
        System.out.println( a);

        // 97 , 92 + 87  +2 = 990
        // 1~ 96 곱셈
        // 1 이였고 6 이되고? 11이 되고?

    }
}
/*
* for문 반복문으로 초기값 , 조건식, 증감식에 따라
* 초기값을 조건식에 맞춰 증감 하려 반복을 하며
* 초기값으로는 보통 정수형 형태로 사용하며 증감을 하는 변수의 값을 사용하게 됨
* 조건식은 해당조건이 참인경우 실행 하겠다 라는 의미로 거짓이 될때까지 반복을 하게 됨
* 증감값은 for 문에서 증감식에 따라 N회 반복을 하겠다 명시 하는거임
* 쨋든 그런거임
* */
// 반복문 종류는 크게 for, while 문이 있고 추가적으로 특정상황에서 사용되는 do - while 문이 있다
// for문의 경우는 초기값과 조건식, 증감값을 위에 정의 해서 반복하는 반복문이며
// while 문의 경우는 조건식에 따라 참인경우 반복하는 반복문으로 간혹 무한루프의 문제를 예방하고자 if문등으로 break 를 넣는게 좋음
//do- while 문의 경우는 do 한번은 무조건 실행 함으로 예외처리용 또는 테스트 용 코드로 많이 사용이 된다
//끝~
/*
* for문의 내용물을 뜯어 보면
* for (int i = 0 ; i<10 ; i++) 를 풀었을때
*
* int i = 0 ;
*if ( i < 10) {
* i++;
* }
* 이 구조로 컴파일 되는게 맞네;;
* */




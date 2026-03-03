package ch01_variale_operator;

public class LogicalOperator {
    static void main() {
        int x =3, y = 2;
        //관계 연산자~~ 관계 흠...
        //<,>,=<,>=,=,!,==
        // 참과 거짓


        System.out.println("x = " +x+", y="+ y);
        System.out.println(" x > y : " + ( x > y ) );
        System.out.println(" x < y : " + ( x < y ) );

        System.out.println(" x >= y : " + ( x >= y ) );
        System.out.println(" x <= y : " + ( x <= y ) );

        System.out.println(" x != y : " + ( x != y ) );
        System.out.println(" x == y : " + ( x == y ) );
        // 논리 연산자
        System.out.println("4 < 5 && 3 != 6 " +(4 < 5 && 3 != 6 ));
        boolean bool = (4 > 7 || 3 == 6);
        System.out.println("4 > 7 || 3 == 6 " + bool );
        System.out.println("!(4 > 7 || 3 == 6) " + !bool );


        int m = 3;
        switch (m) {
            case 1:
                System.out.println("1월");
                break;
            case 2:
                System.out.println("2월");
                break;
            case 3:
                System.out.println("3월");
                break;
            case 4:
                System.out.println("4월");
                break;
            case 5:
                System.out.println("5월");
                break;
            case 6:
                System.out.println("6월");
                break;
            case 7:
                System.out.println("7월");
                break;
            case 8:
                System.out.println("8월");
                break;
            case 9:
                System.out.println("9월");
                break;
            case 10:
                System.out.println("10월");
                break;
            case 11:
                System.out.println("11월");
                break;
            case 12:
                System.out.println("12월");
                break;
        }
        if(m >= 2 && m <=5 ){
            System.out.println("봄");
        }else if(m >= 6 && m <= 9){
            System.out.println("여름");
        } else if (m >= 10 && m <= 11) {
            System.out.println("가을");
        }else {
            System.out.println("겨울");
        }
        boolean r = ( m >=3 && m <= 6 );
        System.out.println("r : " + r);
        String mo = m>=3 && m<=6 ? "봄" : m >=6 && m<=9 ? "여름" : m >=10 && m<=11? "가을" : "겨울";
        System.out.println(mo);
        //위 부터 switch_case 문을 통한 월 출력
        // if - else_if 중첩 if 문을 이용한 계절 출력

        /*
        *추가 sout는 System 에서 지정하는
        * Standard? 형태 즉 기본 형태의 스트림을 사용하겠다
        * OUT 은 내보내는 아웃 스트림을 사용한다 라는 의미이며
        * Println 정확하게 print 라는 함수는
        * 출력을 담당하는 함수로
        * 정리하면 System의 기본 out 스트림을 이용해 print 라는 함수를 실행 하겠다 라는 의미
        *
        * 관계 연산자 는 주로 제어문과 반복문에 사용되며
        * 조건식에 들어가는 용도로 사용이 됨
        * 참과 거짓 , 이상과 이하, 초과와 미만 을 구분하여
        * 조건식을 제작하여
        * 제어문에서는 주로 참과 거짓을 구분하기 위해서
        * 반복문에서는 참과 거짓을 통해 반복을 할지를 정하기 위해서
        * 사용이 됨
        *
        * 논리 연산자는 컴퓨터 시스템의 핵심인 0과 1을 구분하는 걸로
        * 주로 조건식과 조건식 사이에서 연결하여 참과 거짓으로 구분하는 방식으로 사용되며
        * 여러 조건식을 중복으로 검사할 필요가 있을때 사용됨
        * 예시로 status != null 과 token != null 을 논리 연산을 통해서
        * status != null && token != null 을 사용하며
        * status 는 널이 아니며 token 또한 널이 아닌 경우 실행을 할 때 사용됨
        * 부정 : 참은 거짓 , 거짓은 참
        * and : 둘다 참인경우에만 참 아니면 거짓
        * OR : 둘중 하나라도 참이면 참 아니면 거짓
        * */
    }
}

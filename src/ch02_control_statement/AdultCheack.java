package ch02_control_statement;

import java.util.Scanner;

public class AdultCheack {
    static void main() {
        String name ;
        int age ;
        int gender ;
        String g, a;
        Scanner s = new Scanner(System.in);
        System.out.print("이름을 입력 하세요~~ : ");
        name = s.nextLine();

        System.out.print("나이를 입력 하세요~~ : ");
        age = s.nextInt();
        if ( age >= 19 ) a= " 성인 입니다~ ";
        else a = " 미성년자 출입 금지 입니다~~ ";

        System.out.println("성별을 입력 (남 1 : 여 0 )");
        gender = s.nextInt();

        if(gender == 1 ) g = " 남성 ";
        else if(gender == 0 ) g= " 여자 ";
        else g = " 성별을 0 또는 1만 입력하라 했잖아요? 눈 없어요? 눈 필요 없음 뽑아 드릴까요? ";

        System.out.println(" 이름 : "+name + " 나이 : " + age + " 성별 : " + g);
        System.out.println( a );
        // print 메소드 : 문자열을 출력
        System.out.printf("이름 : %S , 나이 : %d , 성별 : %s  \n",name, age, g);
        System.out.printf("%s",a);
        //서식 지정
        System.out.println("하하하하하하하하하하하하하하하하하");
    }

}

package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main() {
        try {


        Scanner s = new Scanner(System.in);

        System.out.print(" 몇명인가요? : ");
        int h = s.nextInt();

        int total = 0;
        int count = 1;
        int a =0 , b=0 ;
        while (true){
            System.out.print(count+"번 점수 입력 : " );
            a = s.nextInt();
            if ( a <=0) {
                System.out.println(" 음수 입력됨 절대값으로 변경 ");
                a = Math.abs(a);
            }
            total += a;

            if(count == h ) break;

            count++;
        }
            System.out.println(h+"명의 점수 총합 :" + total + "점");
            System.out.printf("%d 명의 평균 : %.2f점 ",h , ((double)total/(double)h));
        }catch (Exception e){
            System.out.println(" 오류 발생  Error 메시지 :  \n"+e );

        }

    }
}

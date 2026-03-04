package ch02_control_statement;

import java.util.Scanner;

public class Switch01 {
    static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("숫자 입력 ( 1 ~ 6 ) : ");
        int i = a.nextInt();


        switch ( i ){
            case 1:
            case 3:
            case 5:
                System.out.println( " 홀 ");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println(" 짝 ");
                break;
            default:
                System.out.println(" 1~ 6  이 아님 ");
                break;
        }
    }
}

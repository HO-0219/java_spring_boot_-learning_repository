package ch02_control_statement;

import java.util.Scanner;

public class Switch02 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("( 1 ~ 12 사이 )숫자 입력 : ");

        int m = s.nextInt();
        switch ( m ){
            case 3:
            case 4:
            case 5:
                System.out.println(" 봄 ");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println( " 여름 ");
                break;
            case 10:
            case 11:
                System.out.println( " 가을 ");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println(" 겨울 ");
                break;
            default:
                System.out.println(" 1 ~ 12 사이 수를 입력 하세요 ^^ ");
                break;
        }
    }
}

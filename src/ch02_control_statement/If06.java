package ch02_control_statement;

import java.util.Scanner;

public class If06 {
    static void main() {
        Scanner a = new Scanner(System.in);
        System.out.println( " 숫자 입력  : ");
        int s = a.nextInt();

        if( s >= 3 && s <=5 ) System.out.println( " 봄 ");
        else if (s >5 && s < 10 ) System.out.println(" 여름 ");
        else if ( s >= 10 && s < 12) System.out.println( "  가을  ");
        else if( s == 12 || s <= 2) System.out.println(" 겨울 ");
        else System.out.println(" 1~ 12 숫자 입력 ");
    }
}

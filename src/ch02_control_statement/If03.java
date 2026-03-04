package ch02_control_statement;

import java.util.Scanner;

public class If03 {
    static void main() {
        Scanner a = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int j = a.nextInt();
        if (j >= 90 ) { //a b c d e
            System.out.println(" A ");
        } else if (j >= 80) {
            System.out.println(" B ");
        } else if (j >= 70 ) {
            System.out.println( " C ");
        } else if ( j >= 60) {
            System.out.println(" D ");
        }else {
            System.out.println(" F ");
        }
    }
}

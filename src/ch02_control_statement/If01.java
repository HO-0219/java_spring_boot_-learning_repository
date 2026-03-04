package ch02_control_statement;

import java.util.Scanner;

public class If01 {
    static void main() {
        Scanner a = new Scanner(System.in);
        System.out.print(" 숫자 입역 : ");
        int inp = a.nextInt();

        if ( (inp%2) == 0 ) System.out.println("짝수");
        else System.out.println("홀수");

        for (int i = 0; i < inp ; i++) {
            System.out.println("안녕하세요~~~ " + i);
        }
    }
}


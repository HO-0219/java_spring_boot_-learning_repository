package ch02_control_statement;

import java.util.Scanner;

public class If02 {
    static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("숫자 입력 : ");
        int b = a.nextInt();

        if (b%2 ==0 ) System.out.println("하하하");
        else System.out.println("호호호 ");
    }
}

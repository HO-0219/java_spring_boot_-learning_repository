package ch02_control_statement;

import java.util.Scanner;

public class If05 {
    static void main() {

        //s가 7의 배수이면 제곲 아니면  아니면 3을 더함
        Scanner a = new Scanner(System.in);
        System.out.print(" 숫 자 입 력 : ");
        int s = a.nextInt();

        if(s%7 ==0 ) System.out.println( Math.pow(s,2));
        else System.out.println( s + 3);
    }
}

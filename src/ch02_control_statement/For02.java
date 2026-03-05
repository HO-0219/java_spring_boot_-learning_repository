package ch02_control_statement;

import java.util.Scanner;

public class For02 {
    static void main() {
        // 1~ 10 짝 홀 합
        Scanner s= new Scanner(System.in);

        int a =0, b =0;
        System.out.println(" 홀짝 더할 수 입력");
        int ss = s.nextInt();
        for (int i = 0; i <= ss ; i++) {
            if(i%2==0) a += i;
            else  b+=i;
        }
        System.out.println( " 짝 수 합 : " + a + " 홀 수 합 : " + b);
    }
}
//
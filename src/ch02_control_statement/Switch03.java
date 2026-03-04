package ch02_control_statement;

import java.util.Scanner;

public class Switch03 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("수를 입력 : ");
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        double a;
        a = sum/(arr.length) ;
        String m = "평균 : %.1f ";
        System.out.printf(m,a);

    }
}

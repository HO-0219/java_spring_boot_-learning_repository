package ch02_control_statement;


import java.util.Scanner;

public class For04 {
    static void main() {

        for (int i = 0; i < 5 ; i++) {
            System.out.println(" 안녕? ");
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.println(i +" X " + j + " = " + (i*j) );
            }
            System.out.println(" ========== ========== ========== ");
        }

        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");
        Scanner s = new Scanner(System.in);
        System.out.print("수 입력 :");
        int n = s.nextInt() , sum =0;
        for (int i = 0; i < n ; i++) {
            sum += i;
        }
        System.out.println(" 1 ~ "+ n+"까지의 합은 : "+ sum);

        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");
        System.out.println(" ========== ========== ========== ");

        for (int i = 1; i <= 6  ; i++) {
            for (int j = 1 ; j <= 6-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int sum1 = 0;
        int sum2 =0;
        for (int i = 0; i <51 ; i++) {
            if(i%3 ==0 ) sum1 += i;
            else  sum2 +=i;
        }
        System.out.println("3의 배수 "+ sum1);
        System.out.println("3의 배수가 아님 " + sum2);
        System.out.println("3의 배수의 총합 - 3의 배수가 아닌 값의 총합 =  " + Math.abs(sum1 - sum2));

        int i= 1;
        int a=0, b =0 ;
        while ( true){
            switch (i%2){
                case 0:
                    a +=i;
                    break;
                default:
                    b+=i;
                    break;
            }
            if (i ==11)break;

            i++;

        }
        System.out.println("1~ 10 까지 짝 수 총함 " + b);
        System.out.println("1~ 10 까지 홀수 총합 "+ a);


    }
}

package ch02_control_statement;

import java.util.Scanner;

public class While01 {
    static void main() {
        Scanner s= new Scanner(System.in);
        System.out.print(" 1 ~ N 까지 더할 수를 입력 하세요~~~~~~~~~~~~~~~   :  ");
        int a= s.nextInt() ;
        int i = 1, sum = 0 ;
        while (true){
            if(i > a) break;

            sum += i;
            i++;
        }
        System.out.println(sum);

        System.out.println();
        i=1;
        sum =0;
        while ( i < 101){
            sum += i;
           // System.out.println(i);
            i+=3;
        }

        System.out.println(sum);

        i=97;
        sum =0;
        //97 -5 ~ 2 - 990
        while(i >= 2){
            sum += i;
            i-=5;
        }
        System.out.println(sum);
        i=1;
        sum =0;
        while (i < 97){
            sum += (int) Math.pow(i,2);
            i+=5;
        }
        System.out.println(sum);


    }
}
//
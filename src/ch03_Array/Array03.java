package ch03_Array;

import ch01_variale_operator.Printme;

import java.util.Scanner;

public class Array03 {
    static void main() {
        try {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력 하세요~~~~~~ ");
        int n = s.nextInt();
        int[] arr = new int[n];
       int sa= 0, sb=0;

        for (int i = 0 ; i < arr.length ; i ++ ){
            System.out.print("숫자를 입력하세요~~~~~~~ : ");
            arr[i] = s.nextInt();

            if(arr[i] %2 == 0){
                sa += arr[i];
            }else {
                sb += arr[i];
            }
        }
        System.out.println("짝수의 총합  : " +  sa);
        System.out.println("홀수의 총합  : " +  sb);

        }catch (Exception e){
            System.out.println("에러 : \n"+ e );
        }


    }
}

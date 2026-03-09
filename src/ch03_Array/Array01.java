package ch03_Array;

import java.util.Scanner;

public class Array01 {
    static void main() {
//        try {
//            Scanner s = new Scanner(System.in);
//            System.out.print("몇번 반복?");
//            int l = s.nextInt();
//            int[] a = new int[l];
//            int total =0;
//            for (int i = 0 ; i < a.length ; i++) {
//                System.out.print("숫자 입력 ~ ");
//                a[i] = s.nextInt();
//                total += a[i];
//            }
//            System.out.println( "\n" + total + " 점 ");
//            System.out.println(total/l +" 점 ");
//        }catch (Exception e){
//            System.out.println(" Exception ");
//            System.out.println(e);
//        }
//
//        try {
//            Scanner s = new Scanner(System.in);
//
//            System.out.print("반복할 숫자 입력 :");
//            int sr = s.nextInt();
//            int[] arr = new int[sr];
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print("숫자 입력 : ");
//                arr[i] = s.nextInt();
//            }
//            for (int i = arr.length - 1; i >= 0; i--) {
//                System.out.println("입력한 값 : " + arr[i]);
//            }
//        }catch ( Exception e) {
//            System.out.println("Exception " + e );
//        }

//    int[] arr = {15, 12 ,12};
//        for (int i = 0; i <  arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = (arr.length) -1 ; i >= 0 ; i--) {
//            System.out.println(arr[i]);
//        }
        Scanner s= new Scanner(System.in);
        String [] bts = new String[7];
// 진 , 뷔, 정국, rm, 지민, 슈가, 제이홉

        for (int i = 0; i <bts.length ; i++) {
            System.out.print("bts 멤버 이름 : ");
            bts[i] = s.nextLine();
        }
        for (int i = bts.length -1 ; i >= 0 ; i--){
            System.out.println(bts[i]);
        }







    }

}

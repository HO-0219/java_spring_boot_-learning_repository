package ch01_variale_operator;

public class PluseMinus01 {
    static void main() {
    /*
    *     int a = 10;
        int b = 22;
        int c = 0 ;
        c = a++ + --b;
        System.out.println(a); // 11
        System.out.println(b); // 21
        System.out.println(c); // 31

    * */

        System.out.println("=============================================");
        int x = 5;System.out.println("X: "+ x);
        System.out.println("=============================================");
        System.out.println("X: "+ x);x++;System.out.println("X: "+ x);
        System.out.println("=============================================");
        System.out.println("X: "+ x);++x;System.out.println("X: "+ x);
        System.out.println("=============================================");


        System.out.println("X: "+ x);
        x=  x+ 5 + (++x);
        System.out.println("X: "+ x);
        System.out.println("=============================================");

//
//        int a = 15;
//        int b = 12;
//        int c = --a + --b;
//        System.out.println(a); // 14
//        System.out.println(b); // 11
//        System.out.println(c); // 25

        int a = 10;
        int b = 20;

        int c = ++a + b--;
        System.out.println(a); // 11
        System.out.println(b); // 19
        System.out.println(c); // 31


    }

}

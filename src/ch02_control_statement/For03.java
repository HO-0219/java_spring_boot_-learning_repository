package ch02_control_statement;


public class For03 {
    static void main() {
        int a= 0 ;
        for (int i = 0; i < 51 ; i++) {
            a += i;
        }
        System.out.println(a);

        a = 0;
        for (int i = 0 ; i < 101 ; i+=2 ){
            a += i;
        }
        System.out.println(a);
        a=0;
        for (int i = 1; i <100 ; i+=2) {
            a +=i;
        }
        System.out.println(a);

        a=0;
        for (int i = 100; i >=5 ; i-=5) {
            a +=i;
        }
        System.out.println(a);


        a=0;
        for (int i = 2; i <=20 ; i+=2) {
            a +=(int) Math.pow(i,2);
        }
        System.out.println(a);


        a=0;
        for (int i = 5; i <=100 ; i+=5) {
            a +=(int) Math.pow(i,2);
        }
        System.out.println(a);


    }
}
package ch01_variale_operator;

public class Add_Project {
    static void main(String[] args) {
        // 3+5
        int a= 3;
        int b= 5;
        System.out.println("================");
        System.out.println(" a + b = "+ (a+b));
        System.out.println("================");
        System.out.println(" a - b = "+ (a-b));
        System.out.println("================");
        System.out.println(" a / b = "+ (a/b));
        System.out.println("================");
        System.out.println(" a * b = "+(a*b));
        System.out.println("================");
        System.out.println(" a % b = "+ (a%b));
        System.out.println("================");

// 구구단~
        System.out.println("================");
        System.out.println("구구단을 외우자");
        System.out.println("================");
       for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.println(i +" * "+ j + " = " + (i*j));
            }
            System.out.println("================");
        }


    }
}


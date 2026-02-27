package ch02;

public class T001 {
    static void main() {
        for (int i = 0; i < 3 ; i++) {
            System.out.println(" ");
        }


        for (int j = 0; j < 5 ; j++) {
            for (int k = 0 ; k < j ; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j * 2 ; i++) {

                System.out.print("*");
            }

            System.out.println(" ");

        }
    }
}

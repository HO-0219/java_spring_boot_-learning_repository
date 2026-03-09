package ch04_class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProductMain_01 {
    static void main() {
        Date date = new Date();
        SimpleDateFormat smdf= new SimpleDateFormat("yyyy년 MM월 dd일");
        Scanner s = new Scanner(System.in);

        Product_01 sin = new Product_01("신라면", 2200, smdf.format(date) );
        Product_01 black = new Product_01("짜빠게티" , 2000 , smdf.format(date) );
        System.out.println("\n \n ");
        sin.print_Product();
        black.print_Product();

        System.out.println(sin.add_Product(10 , 20) );
    }
}

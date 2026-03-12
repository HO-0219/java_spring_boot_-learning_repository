package ch06_abstract_interface;

import ch04_class.Product_01;

public class MyProduct {
    static void main() {
        Product_01 apple = new Product_01("사과",2400,"2026/03/12");
        apple.name = "사사과과";
        System.out.println("\n\n\n\n");
        System.out.println(apple.name);
        }
}

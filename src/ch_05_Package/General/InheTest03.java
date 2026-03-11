package ch_05_Package.General;

public class InheTest03 {
    static void main() {
        Americano03 americano03 = new Americano03("아메리카노", 4000.0, 201.0);
        Latte03 latte03 = new Latte03("라떼", 4500.0, "우유");
        Espresso03 espresso03 = new Espresso03("에소프레소",2500.0,2);
        americano03.addOtionPrice();
        americano03.showInfo();
        latte03.addOtionPrice();
        latte03.showInfo();
        espresso03.addOtionPrice();
        espresso03.showInfo();
    }
}

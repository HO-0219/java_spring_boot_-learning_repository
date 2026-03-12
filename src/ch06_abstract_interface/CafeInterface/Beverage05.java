package ch06_abstract_interface.CafeInterface;

public abstract class Beverage05  {
    final static public String STORE_NAME = "97세 곽춘팔씨의 95번째 인생 최후의 카페";
    private  String  name;
    private double price;


    private static int beverageCount = 0;
    public static int  getBeverageCount() {
        return beverageCount;
    }


    public double getPrice() {
        return price;
    }
    /*
    * 모든 음료는 마신다
    * */


    public abstract void drink();

    public  Beverage05(){}
    //alt + insert  클래스에서 자동완성 단축키

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;
        beverageCount++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "주문 내역{" +
                "상품 명 ='" + name + '\'' +
                ", 가격 =" + price +
                '}';
    }
}

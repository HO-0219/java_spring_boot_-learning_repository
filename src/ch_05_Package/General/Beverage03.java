package ch_05_Package.General;

// 부모 클래스의 변수에 접근
//private get/set
//protected 로 대신 해서 사용 가능

public class Beverage03 {
    public Beverage03(String name , double price){
        this.name= name;
        this.price =price;
    }

    public Beverage03() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice(){
        return price + addOtionPrice();
    }
    public  double addOtionPrice(){
        return  0.0;
    }

    private String name;
    private double price ;

    public void showInfo() {
        System.out.println("원래 가격 : "+ price);
        System.out.print("상품명 : " + name + " 가격 :" + getTotalPrice());
        System.out.println("추가 금액 : "+addOtionPrice());
    }



}

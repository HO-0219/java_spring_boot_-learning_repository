package ch_05_Package.MyBeverage;



public class Beverage04 {
    public Beverage04(String name , double price){
        this.name= name;
        this.price =price;
    }

    @Override
    public String toString() {
        String m = name +"오버라이딩 오브젝트에 있는 함수를 오버라이딩한 부모의 오버라이딩";
        return  super.toString()+ "\n"+m;
    }

    public Beverage04() {
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

    public String getName() {
        return name;
    }

    private String name;
    private double price ;

    public void showInfo() {
        System.out.println("원래 가격 : "+ price);
        System.out.println("상품명 : " + name + " \n 가격 :" + getTotalPrice()+"원");
        System.out.println("추가 금액 : "+ addOtionPrice() +"원");
    }


    public void drink() {
    }
}

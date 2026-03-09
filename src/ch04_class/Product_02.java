package ch04_class;

public class Product_02 {
    static String brand;
    private String name;
    private int price;
    private String inDate;

    public void getter(){
        System.out.println("상품명 : " +this.name +"\n 가격 : "+ this.price + "\n 등록일 : "+this.inDate );
    }
    public void setter(String name){
        this.name = name;
    }
    public void setter(int price){
        this.price = price;
    }
    public void setter_date(String inDate){
        this.inDate = inDate;
    }



}

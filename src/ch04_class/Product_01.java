package ch04_class;

public class Product_01 {
    public String name;
    int price;
    String inputdate ;

    public Product_01(String name , int price, String indate) {
        System.out.println("객체 생성 완료");
        System.out.println("이름 : "+ name + " \n가격 : " +price +"원 \n등록일은 : "+ indate);
        this.name = name;
        this.price = price;
        this.inputdate =indate;
    }
    private void show_Data(){
        System.out.println("상품 정보 출력");
        System.out.println("이름 : " + this.name );
        System.out.println("가격 : " + this.price );
        System.out.println("등록일 : " + this.inputdate );
    }
    public  void print_Product(){
        show_Data();
    }

    private int add_(int a, int b){
        return a +b;
    }
    public int add_Product(int a, int b){
       return add_(a,b);
    }

}


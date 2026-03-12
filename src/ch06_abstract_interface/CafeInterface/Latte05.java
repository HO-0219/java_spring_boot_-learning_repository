package ch06_abstract_interface.CafeInterface;

public class Latte05 extends  Beverage05 implements  MilkAddable{
    private  String  milkType;

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }


    @Override
    public void drink() {
        System.out.println(super.getName()+" 을 마신다. 라떼는 마쉿따.");
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+super.getName()+"{" +
                "우유의 종류 ='" + milkType + '\'' +
                '}';
    }



    @Override
    public void changeMilk(String milkType) {
        System.out.println("여기서 "+this.milkType+"로 만든 라떼");
        this.milkType = milkType;
        System.out.println("변경할 우유 :  "+milkType+"로");
        System.out.println("최종적으로 "+this.milkType+"로 만든 라떼");
    }
}

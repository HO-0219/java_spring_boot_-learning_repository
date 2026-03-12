package ch06_abstract_interface.CafeInterface;

public class Capuccino05 extends  Beverage05 implements MilkAddable , WaterAdjustable{
    private  String milkType;
    private  double foamAmount;

    public Capuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }

    @Override
    public void drink() {
        System.out.println(super.getName()+"라는 ");
        System.out.println("카푸 치노 먹는다!!!");
        System.out.println("가격 " + super.getPrice());
        System.out.println("우유 타입 : "+ this.milkType + "  거품량 "+foamAmount);

    }
    @Override
    public String toString() {
        return super.toString()+"\n"+super.getName()+"{" +
                "우유의 종류 ='" + milkType + '\'' + "거품양 : " + foamAmount +
                '}';
    }
    @Override
    public void addwater(double amount){
        this.foamAmount += amount;
        System.out.println("거품 추가 : " + amount);
        System.out.println("거품 양 : " + this.foamAmount);

    }


    @Override
    public void changeMilk(String milkType) {
        System.out.println("원래는 이거인데 "+this.milkType+"로 만든 라떼");
        this.milkType = milkType;
        System.out.println("변경할 우유 :  "+milkType+"이며");
        System.out.println("최종적으로 "+this.milkType+"로 만든 라떼");
    }
}

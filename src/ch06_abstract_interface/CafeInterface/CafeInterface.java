package ch06_abstract_interface.CafeInterface;

public class CafeInterface extends Beverage05 implements MilkAddable, ShotAddable, WaterAdjustable {

    private  double wateramount;
    private  int shotCount;
    private  String  milkType;

    public CafeInterface(String name, double price, double wateramount, int shotCount, String milkType) {
        super(name, price);
        this.wateramount = wateramount;
        this.shotCount = shotCount;
        this.milkType = milkType;
    }

    @Override
    public void drink() {
        System.out.println(super.getName()+"은 "+ wateramount+" 만큼의 물이 들어가며 \n"+shotCount+"만큼의 샷이 추가 되고 \n"+milkType+"이 들어가는 스페셜한 음료 입니다 ~ \n" +"가격은 : "+super.getPrice() +"입니다.");

    }

    @Override
    public void changeMilk(String milkType) {
        this.milkType = milkType;
        System.out.println("변경할 우유 :  "+milkType+"이며");
        System.out.println("최종적으로 "+this.milkType+"로 만든 라떼");
    }

    @Override
    public void addwater(double amount) {
        this.wateramount += amount;
        System.out.println("물 추가 : " + amount);
        System.out.println("물 양 : " + this.wateramount);

    }
    @Override
    public void addshot(int amount) {
        this.shotCount += amount;
        System.out.println("샷추가 : "+amount);
        System.out.println("최종 샷 : "+ this.shotCount);
    }
}

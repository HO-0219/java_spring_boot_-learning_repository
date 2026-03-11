package ch_05_Package.General;

public class Latte03 extends Beverage03{
    private String milkType;

    public Latte03(String name, double price , String milkType) {
        super.setName(name);
        super.setPrice(price);
        this.milkType = milkType;
    }
    @Override
    public  void showInfo(){
        super.showInfo();
        System.out.println("우유 타입 : " +milkType);
    }

    @Override
    public double addOtionPrice(){
        switch (milkType){
            case "흰우유":  return 0;
            case "초코우유": return 1500.0;
            case "저지방우유": return  20000.0;
            default: return 25000;
        }
    }

}

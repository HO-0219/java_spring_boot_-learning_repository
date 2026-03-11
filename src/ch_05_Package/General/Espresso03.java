package ch_05_Package.General;

public class Espresso03 extends Beverage03{
    private int shotCount;

    public Espresso03(String name, double price ,int shotCount) {

        super.setName(name);
        super.setPrice(price);
        this.shotCount = shotCount;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("샷추가 횟수 : "+ shotCount);
    }
    @Override
    public double addOtionPrice(){
        switch (shotCount){
            case 1: return  0.0;
            case 2: return  500.0;
            case 3: return  1000.0;
            default: return  2000.0;
        }
    }
}

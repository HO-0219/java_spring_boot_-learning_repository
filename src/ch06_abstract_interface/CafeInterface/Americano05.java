package ch06_abstract_interface.CafeInterface;

public class Americano05 extends  Beverage05 implements WaterAdjustable {
    private  double water_Amount;

    public Americano05(String name, double price, double water_Amount) {
        super(name, price);
        this.water_Amount = water_Amount;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() +" 을 마신다. 아메 아메 아메 아메 아메리카노~~~");
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ super.getName() +"{" + "물의 양 =" + water_Amount +'}';
    }


    @Override
    public void addwater(double amount) {
        this.water_Amount += amount;
        System.out.println("물 추가 : " + amount);
        System.out.println("물 양 : " + this.water_Amount);

    }

}

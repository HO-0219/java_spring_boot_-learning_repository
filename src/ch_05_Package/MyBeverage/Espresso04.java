package ch_05_Package.MyBeverage;


import ch_05_Package.MyBeverage.Beverage04;

public class Espresso04 extends Beverage04 {
    private  int shotCount;
    public Espresso04(String name, double price, int shotCount){
        super(name, price);
        this.shotCount=shotCount;
    }
    public double addOtionPrice(){
        switch (shotCount){
            case 1: return  0.0;
            case 2: return  500.0;
            case 3: return  1000.0;
            default: return  2000.0;
        }
    }
    public void drink(){


        String m = super.getName() +"마신다 에스프레소";
        System.out.println(m);
    }
}

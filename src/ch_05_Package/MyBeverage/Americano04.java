package ch_05_Package.MyBeverage;

import ch_05_Package.MyBeverage.Beverage04;

public class Americano04 extends  Beverage04 {
    private  double waterAmount;

    public Americano04(String name, double price, double waterAmount){
        super(name, price);
        this.waterAmount =waterAmount;
    }

    @Override
    public String toString() {
        String m = super.getName() +" 이건 오브젝트의 tostring 을 오버라이딩을 한 부모 클레ㅐ스를 또 한번 오버라이딩한 거임";
        return super.toString()+"\n"+m;
    }

    public double addOtionPrice(){
        if(waterAmount >= 200.0){
            return  500.0;
        }else{
            return 0;
        }
    }
    public void drink(){
        String m = super.getName() +"마신다 아메아메아메아메아메아메아메아메아메아메아메아메아메";
        System.out.println(m);
    }
}

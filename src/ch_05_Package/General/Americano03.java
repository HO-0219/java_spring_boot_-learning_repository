package ch_05_Package.General;

public class Americano03 extends  Beverage03{
    private double waterAmount;

    public Americano03(String name, double price, double waterAmount) {
        this.waterAmount = waterAmount;
        super.setName(name);
        super.setPrice(price);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("물양은 " +waterAmount);
    }



    @Override
    public double addOtionPrice(){
        if(waterAmount >= 200.0){
            return  500.0;
        }else{
            return 0;
        }
    }

}

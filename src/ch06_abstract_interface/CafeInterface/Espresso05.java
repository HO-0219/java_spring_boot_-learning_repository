package ch06_abstract_interface.CafeInterface;

public class Espresso05 extends Beverage05 implements ShotAddable{
    private  int shotCount;

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    @Override
    public void drink() {
        System.out.println(super.getName() + " 을 마신다~~~  Now he's thinkin' 'bout me every night, oh\n" +
                "Is it that sweet? I guess so\n" +
                "Say you can't sleep, baby, I know\n" +
                "That's that me espresso");

    }

    @Override
    public String toString() {
        return super.toString()+"\n "+super.getName()+"{" +
                "기본 샷 =" + shotCount +
                '}';
    }



    @Override
    public void addshot(int amount) {
        this.shotCount += amount;
        System.out.println("샷추가 : "+amount);
        System.out.println("최종 샷 : "+ this.shotCount);
    }

}

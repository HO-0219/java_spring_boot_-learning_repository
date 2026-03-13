package American_power.Weapon_;

public class BunkerBuster extends  Weapon{
    private double penetrationDepth;


    public BunkerBuster(String name, String type, double weight, double length, String explosive, int num, double penetrationDepth) {
        super(name, type, weight, length, explosive, num);
        this.penetrationDepth = penetrationDepth;
    }

    @Override
    public void weaponInfo() {
        super.weaponInfo();
        System.out.println(super.getType()+"의 믁;"+super.getName()+"의 파괴 깊이는 "+this.penetrationDepth);
    }
}

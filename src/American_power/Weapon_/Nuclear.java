package American_power.Weapon_;

public class Nuclear extends  Weapon{
    private double total_Evaporation_Range;
    private  double severe_Destruction_Range;
    private  double burning_Range;

    public Nuclear(String name, String type, double weight, double length, String explosive, int num, double total_Evaporation_Range, double severe_Destruction_Range, double burning_Range) {
        super(name, type, weight, length, explosive, num);
        this.total_Evaporation_Range = total_Evaporation_Range;
        this.severe_Destruction_Range = severe_Destruction_Range;
        this.burning_Range = burning_Range;
    }

    @Override
    public void weaponInfo() {
        super.weaponInfo();
        System.out.println(super.getType()+"의 믁;"+super.getName()+"의 파과 범위는 각각");
        System.out.println("완전 파괴 범위 :" + this.total_Evaporation_Range);
        System.out.println("심각한 파괴 범위 : "+ this.severe_Destruction_Range);
        System.out.println("3도 화상 범위 : "+this.burning_Range);
        System.out.println("입니다.");

    }
}

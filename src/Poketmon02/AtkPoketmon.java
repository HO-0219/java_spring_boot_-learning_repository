package Poketmon02;

public class AtkPoketmon extends Poketmon {
    private  String default_skill_name ;
    private String special_skill_name;
    private  double atk;

    public AtkPoketmon(String name, String type, String default_skill_name, String special_skill_name, double atk) {
        super(name, type);
        this.default_skill_name = default_skill_name;
        this.special_skill_name = special_skill_name;
        this.atk = atk;
    }

    public double getAtk1 (){
        System.out.println( super.getName() + default_skill_name);

        System.out.println(" 공격 "+default_skill_name +" 의 공격력은 "+ atk +"입니다");
        return this.atk;
    }
    public  double getAtk2(){
        System.out.println(super.getName() + special_skill_name);

        System.out.println("  공격 "+ special_skill_name +" 의 공격력은 "+ atk*1.5 +"입니다");
        return  (this.atk*1.5);
    }

    public String getSpecial_skill_name() {
        return special_skill_name;
    }

    public String getDefault_skill_name() {
        return default_skill_name;
    }

    @Override
    public void nowInfo(){

    }

    @Override
    public void showInfo() {
        System.out.println("==  공격 포켓몬 ==");
        super.showInfo();
        System.out.println("기본 공격 : " + default_skill_name + "의 공격력은 "+ atk);
        System.out.println("스페셜 공격 : "+ special_skill_name +"의 공격력은 "+(atk*1.5));

    }
}

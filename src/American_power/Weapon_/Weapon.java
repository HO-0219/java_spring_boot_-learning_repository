package American_power.Weapon_;

public class Weapon {

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    private  String name;
    private  String type;
    private double weight;
    private  double length;
    private String explosive;
    private  int num ; //탑재 갯수

    public Weapon(String name, String type, double weight, double length, String explosive, int num) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.explosive = explosive;
        this.num = num;
    }

    public void weaponInfo(){
        System.out.println("무기 이름 : "+ this.name);
        System.out.println("무기 타입 : "+ this.type);
        System.out.println("무기 무게 : "+ this.weight);
        System.out.println("무기 길이 : "+ this.length);
        System.out.println("무기 폭팔력 : "+ this.explosive);
        System.out.println("무기 탑재 갯수 : " + this.num);
    }
}

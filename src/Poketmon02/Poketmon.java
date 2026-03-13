package Poketmon02;

public abstract class Poketmon {
    private  String name;

    public String getType() {
        return type;
    }

    private  String type;

    public Poketmon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Poketmon() {}
    public void nowInfo(){}
    public void showInfo(){
        System.out.println( "포켓몬 이름 "+ this.name);
        System.out.println(" 포켓몬 타입 " + this.type);
    }
}

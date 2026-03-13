package Poketmon02;

public class DefPoketmon extends Poketmon{
    private double health;
    private  boolean life = true;

    public DefPoketmon(String name, String type, double health) {
        super(name, type);
        this.health = health;
    }

    public void hit(double atk){
        System.out.println("===============================================================");
        System.out.println(super.getName()+"이 공격을 받았따!!!! " );
        System.out.println("받은 데미지는 "+atk);
        System.out.println("===============================================================");
        this.health -= atk;

        this.life = LifeCheck();
        if(this.life == false) System.out.println("죽었다.. 흑흑");
        else System.out.println(this.health +"로 아직은 살아 있다.." );
    }
    private boolean LifeCheck(){
        if(this.health <= 0 )return false;
        else return  true;
    }

    public boolean isLife() {
        return life;
    }
    @Override
    public void nowInfo(){
        System.out.println("==== 샌드백 포켓몬 ====");
        if (this.life){
            System.out.println(" 현재 체력 : " + this.health);
        }else {
            System.out.println(" 샌드백 포켓몬은 마지막 일격을 맞고 체력이 "+this.health+"이 되어 ");
            System.out.println(" 하늘로 떠났습니다..  ");
        }
    }

    @Override
    public void showInfo() {
        System.out.println("==  샌드백 포켓몬 ==");
        super.showInfo();
        System.out.println("기본 체력 : " + health );
        System.out.println(" 곧 죽을 예정 ");

    }
}

package ch04_class;

public class User {
    String name ;
    int age;
    String sex;
    String brd;

    public User(String name, int age, String brd){
        this.name =name;
        this.age = age;

        this.brd = brd;
    }


    public  void set_sex(String sex){
        this.sex=sex;
    }

    public void profile_user(){
        System.out.println(" User 정보 출력 ~ ");
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);

        if(this.sex =="남성")        System.out.println(" 성별 : 남성 " );
        else         System.out.println("성별 : 여성");

        System.out.println("생일 : "+brd);

    }
    private void remane_(String name){
        this.name = name;
        System.out.println("이름은" +this.name );
    }
    public void rename_set(String name){
        if(name == null) System.out.println(" 이름이 비어 있음");

        if(this.name == name) System.out.println("이름이 같아 변경할 수 없음");
        else remane_(name);
    }

}

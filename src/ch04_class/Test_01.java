package ch04_class;

public class Test_01 {
    private String name ;
    private int k;
    private int e;
    private int m;
    private int total;
    private double avg;


    public void setter(String name){
        this.name = name;
    }
    public void setter(int k, int e, int m){
        this.k =k;
        this.e=e;
        this.m=m;
    }
    private void print_resualt(){
        System.out.println("이름 : "+ this.name);
        System.out.println("국어 점수 : "+ this.k );
        System.out.println("영어 점수 : "+ this.e );
        System.out.println("수학 점수 : "+ this.m );

        System.out.println("총점 : "+ adder() );
        System.out.println("평균 : "+ aver());
    }
    private int adder(){
        this.total =this.k+this.e+this.m;
        return  this.total;
    }
    private double aver(){
        this.avg = total/3;
        return this.avg;
    }

    public void getter_Print_resualt(){
        print_resualt();
    }


}

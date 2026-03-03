package ch01_variale_operator;


public class Casting {
    static void main(String[] args) {
        double d =120; //암시적 형변환

        System.out.println("d : " + d);
        System.out.println("d : " + (int)d); //명시적 또는 강제 형변환
        System.out.println("d : " + (char)d); //명시적 또는 강제 형변환

        int i = (int)3.14;
        System.out.println("i : " + i);
        System.out.println((double)14/5);
        System.out.println((double)(14/5));

        int a , b , c;
        a = 50 ;
        b = 60 ;
        c = 80;
        int sum = a +b + c;
        System.out.println("총 점 : " + sum);
        System.out.println("평 점 : " + (double)sum/3);



        char c1 = 'z';
        char c2 = 'a';
        System.out.println( c1 > c2);
        System.out.println((int)c1 +" , "+ (int)c2);
        int c3 = c1 - c2 +5;
        System.out.println(c3);

        c3 = 'D';
        String c4 = (int)c3 >= (int)'A' && (int)c3 <= (int)'Z' ? "대문자" : "소문자";
        System.out.println(c4);










//        Description dsp = new Description();
//        dsp.name = "이순신";
//        dsp.hobby="전쟁";
//        dsp.weight=100;
//        dsp.height= 175.5;
//        dsp.nationality ="조선";
//        dsp.blood ="O형";
//        dsp.PrintingDescription();
//

    }
//    public static class Description{
//        String name ;
//        String nationality ;
//        double height;
//        double weight;
//        String hobby;
//        String blood;
//
//        void PrintingDescription(){
//            System.out.println(this.name + "님의 개인 정보");
//            System.out.println("이름 : "+ this.name);
//            System.out.println("국적 : "+ this.nationality);
//            System.out.println("키 : "+ this.height);
//            System.out.println("몸무게 : "+ this.weight);
//            System.out.println("취미 : "+ this.hobby);
//            System.out.println("혈액형 : "+ this.blood);
//        }
//    }
}

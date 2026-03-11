package ch_05_Package.MyBeverage;

import ch_05_Package.General.Latte03;

import java.util.Scanner;

public class InheTest04 {
    static void main() {
        Beverage04 beverage01  = new Americano04("아메리카노", 4000.0, 200.0);
       // 업케스팅 : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 형태가 바뀌는
       //낮은 : 부모 최상위 클래스인 Beverage04  높은 자식 클래스 : Americano04
       // 전제 조건 반드시 상속 관계 여야 함 !!


    // 레고 를 기준으로 레고라는 블록으로 성을 만들 수 있지만
        // 레고 그 자체의 원형으로는 못만들잖아
        // 그러니 플라스틱과 이런 저런 처리를 통해 만들어 진 레고 만들고 그 레고들로 만들어지는거라 생각하면됨
//        beverage01.showInfo();
        Scanner s = new Scanner(System.in);
        System.out.print("몇개 주문 ? ");
        int n = s.nextInt();

        Beverage04[] bv04s = new Beverage04[n];
        String name;
        double price;
        String milk;
        int count;
        double water;
        for (int i = 0; i <bv04s.length ; i++) {

            System.out.print("어떤 종류의 커피를 주문 하실 예정인가요? 1. 아메리카노, 2. 라떼, 3. 에스프레소");
            int type = s.nextInt();
            switch (type){
                case 1:
                    System.out.print(" 이름 입력 ");
                    name = s.next();
                    System.out.print(" 가격 입력");
                    price = s.nextDouble();
                    System.out.print("물의 양");
                    water = s.nextDouble();
                    bv04s[i]= new Americano04(name, price, water);
                    break;

                case 2:
                    System.out.print(" 이름 입력 ");
                    name = s.next();
                    System.out.print(" 가격 입력");
                    price = s.nextDouble();
                    System.out.print("어떤 우유? ");
                    milk = s.next();
                    bv04s[i]= new Latte04(name, price, milk);
                    break;

                case 3:
                    System.out.print(" 이름 입력 ");
                    name = s.next();
                    System.out.print(" 가격 입력");
                    price = s.nextDouble();
                    System.out.print("몇샷을 넣을 예정이신가요?");
                    count = s.nextInt();
                    bv04s[i]= new Espresso04(name, price, count);
                    break;
                default:
                    System.out.println("없는 값");
                    break;

            }
            System.out.println();
        }
        for (int i = 0; i <bv04s.length ; i++) {
            bv04s[i].addOtionPrice();
            System.out.println("------------------------------");
            bv04s[i].showInfo();
            System.out.println();
            bv04s[i].drink();
            System.out.println("------------------------------");


        }
        for (int i = 0; i <bv04s.length ; i++) {
            //승급된 객체변수가 수많은 서브 클래스 중에서 어떤 클래스로 만들었는지
            //판단 하기 위해 사용 했는데 뭐 어쩌라고
            if (bv04s[i] == null ) break;

            if (bv04s[i] instanceof Americano04) {
                Americano04 am = (Americano04)bv04s[i];
                am.drink();
            }else if (bv04s[i] instanceof Latte04){
                Latte04 late = (Latte04) bv04s[i];
                late.drink();
            }else if (bv04s[i] instanceof Espresso04){
                Espresso04 es = (Espresso04) bv04s[i];
                es.drink();
            }else {
                System.out.println("없엉");
            }
            System.out.println(bv04s[i]);
        }

//        for (int i = 0; i < 10 ; i++) {
//            if(i%2 ==0) bv04s[i] = new Americano04("아메리카노", 4000, 200);
//            else  bv04s[i] = new Latte04("라떼", 4000, "우유");
//        }
//        for (int i = 0; i <10 ; i++) {
//            bv04s[i].drink();
//
//        }

    }
}

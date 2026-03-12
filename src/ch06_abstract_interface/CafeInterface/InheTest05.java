package ch06_abstract_interface.CafeInterface;

public class InheTest05 {
    static void main() {
        Beverage05[] orderlist = {
          new Americano05("아메리카노", 2000, 500),
                new Espresso05("에스프레소", 1500 , 2),
                new Latte05("바닐라 라떼" , 4500, "오트밀"),
                new CafeInterface("스페셜 음료",999990.0, 32000, 15,"두바이쫀득쿠키에 쿠키쉐이크를 섰은 느낌의 우유에 딸기와 바나나 를 추가했다가 망고를 담갔다 뺀 그런 느낌의 우유"),
                new Capuccino05("엽덕 마라탕으로 만든 두쫀쿠 맛 카푸치노 ",25000, "두바이맛 엽떡을 넣은 마라탕",999)
        };
        System.out.println("\n\n\n\n\n\n");

        System.out.println("안녕하세요.~ 저의 카페 이름은 " + Beverage05.STORE_NAME);

        for (Beverage05 a : orderlist){
            System.out.println("================================================================================");
            System.out.println(a);
            System.out.println();
        }
        for (Beverage05 a : orderlist){
            System.out.println("================================================================================");

            if (a instanceof  Americano05) ((Americano05)a).addwater(2000.0);
            else if (a instanceof  Espresso05) ((Espresso05)a).addshot(5);
            else if (a instanceof  Latte05)((Latte05)a).changeMilk("딸기 우유");
            else if(a instanceof CafeInterface) {
                ((CafeInterface) a).addshot(20);
                ((CafeInterface) a).addwater(1500);
                ((CafeInterface) a).changeMilk("두바이 쫀득 쿠키를 담갔다 뺀 물에 초코와 쿠키 딸기 바나나 마라탕을 섞고 망고를 잠깐 담갔다 뺀 우유에 소주와 맥주 그리고 양주를 섞고 또 거기에 찹쌀로 만든 이화주를 섞고 거기에 다시 한번 끓여서 만든 우유메 일본에서 직수입한 노란 노른자를 동동 올리고 오호츠크해 에서 잡은 생선을 말리고 갈고 해서 나온 특별한 생선가루를 첨가 해서 만든 특제 수제 비빔 냉면을 동결건조 후 가루를 내어 물에 타고 다시 끓이면서 점성이 생길때 까지 팔팔팔팔 끓인 원액을 2:8로 탄 우유에 마라탕, 엽떡 , 분모자, 곱창, 막창, 대창, 삼겹살, 갈비, 참치,냉면,육회,를 섞어 순대로 만들고 그 순대로 끓인 순대국에 전분을 넣고 찌고 , 굽고, 튀긴다음 설탕 코팅으로 탕탕 후루후루 탕탕 후루루루루 탕후루로 만들고 그 만든 내용물을 다시금 카다이프와 피스타치오 스프레드를 섞어 두쫀쿠를 만들어 우유에 띄운 우유");
            } else if (a instanceof  Capuccino05) {
                ((Capuccino05)a).addwater(299);
                ((Capuccino05)a).changeMilk("두쫀쿠 빤물");
            }


            a.drink();
            System.out.println();

        }
        System.out.println(Beverage05.getBeverageCount()+"개 만큼 판매 했음");

    }
}

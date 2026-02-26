package ch01_variale_operator;

public class your_Print {
    //main 은 시작점 ~ 그래서 보통은 패키지 내부에 안넣고 루트에 올려 놓거나 하지 않나?..

    static void main(String[] args) {
        // 주석~~~ ctr + / 누르면 한번에
        //프로그랭 실행에 영향을 주지 않는다~~
//        System.out.print("주석");
        System.out.print("길");
        System.out.print("동");
        System.out.print("씨");
     /*
      sout는  System.out.println()을 위한 핫키 킹갓 자동완성~~~ 희흐
        정확하게는 System의 기본 형식을 통해 (시스템의 기본 입출력을 기준으로)
        out 출력을 하겠다
        어떤방식? println 라는 방식으로~~
        그럼 여기서 질문
        ln은 뭐하는 새끼인데 붙어 있을까?
        바로바로바로 줄바꿈~~ \n의 역할을 합니다~~~
        */



        //문자는 외따움표, 문자열을 쌍따움표~~
        /*
        작성자 : 아무개
        작성일 : 2026 02 26
        내용 : 이걸.. 처음부터.. 다시 하고 있는... .
        * */
        for (int i = 0; i < 3 ; i++) {
            System.out.println(" ");
        }


        for (int j = 0; j < 5 ; j++) {
            for (int k = 0 ; k < j ; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j * 2 ; i++) {

                System.out.print("*");
            }

            System.out.println(" ");

        }
    }
}

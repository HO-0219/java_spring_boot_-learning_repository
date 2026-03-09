package ch02_control_statement;

import java.util.Scanner;

public class While03 {
    static void main() {

        try {
            Scanner s = new Scanner(System.in);
            int a= 0;
            int count=0;
            System.out.println("난이도 (1 , 2, 3 ) 입력 : ");

            int ana = s.nextInt();
            ana = Math.abs(ana);
            int sm =0;
            String ms ;
            switch (ana){
                case 1:
                    sm = 10;
                    ms = "이지 난이도 선택 !";
                    System.out.println(ms);
                    break;
                case 2:
                    sm= 100;
                    ms = "노멀 난이도 선택 !";
                    System.out.println(ms);
                    break;
                case 3:
                    sm= 1000;
                    ms = "하드 난이도 선택 !";
                    System.out.println(ms);
                    break;
                default:
                    System.out.println("1 ~ 3 사이 수만 입력 하라고!!!! ");
                    return;
            }

            int answer = (int) (Math.random() *sm);
            while (true){
                System.out.print("1 ~ "+sm+" 사이 숫자 입력: ");
                a = s.nextInt();
                a = Math.abs(a);
                if( a == answer) {
                    System.out.print("       정답!!");
                    break;
                }else if(a > answer) {
                    System.out.print(" Down ");
                }else {
                    System.out.println(" Up ");
                }
                System.out.println();

                count++;
            }
            System.out.println(ms +"N의 정답은 " + answer + " 이며 " + count+"  횟수만에 맞춤 ");


        }catch (Exception e){
            System.out.println(" 오류 메시지  Error : \n " + e);
            return;
        }





    }
}

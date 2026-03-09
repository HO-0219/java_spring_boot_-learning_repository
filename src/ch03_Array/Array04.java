package ch03_Array;

import java.util.Scanner;

public class Array04 {
    static void main() {
        try {
            Scanner s = new Scanner(System.in);


            System.out.print("학생의 수를 입력하세요");
            int count = s.nextInt();
            int[] k = new int[count];
            int[] e = new int[count];
            int[] m = new int[count];
            int[] sn = new int[count];
            int[] total = new  int[count];
            double[] avg = new double[count];
            String[] name = new String[count];
            for (int i = 0; i <sn.length ; i++) {
                System.out.print("이름을 입력하세요~~~~ : ");
                name[i] = s.next();
            }
            for (int i = 0; i <sn.length ; i++) {
                System.out.print(name[i] +" 학생의 국어 점수를 입력 하세요 ~ : ");
                k[i] = s.nextInt();

                System.out.print(name[i] +" 학생의 영어 점수를 입력 하세요 ~ : ");
                e[i] = s.nextInt();

                System.out.print(name[i] +" 학생의 수학 점수를 입력 하세요 ~ : ");
                m[i] = s.nextInt();

                total[i] = k[i] + e[i] + m[i];
                avg[i] = total[i]/3;
            }
            for (int i = 0; i < sn.length ; i++) {
                System.out.println();
                System.out.println(name[i]+"학생의 국어 점수는 " + k[i] +"이며 영어점수는 "+e[i]+"이고 수학점수는 "+m[i]+"입니다.");
                System.out.println("총점수는 "+total[i]+"이며  평균은 "+avg[i]+"입니다");
                System.out.println();
            }


        }catch (Exception e){
            System.out.println("오류 발생 : " + e);
        }
    }
}

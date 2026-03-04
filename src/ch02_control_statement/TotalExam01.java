package ch02_control_statement;

import java.util.Scanner;

public class TotalExam01 {
    static void main() {
       Scanner s = new Scanner(System.in);
       String name ;
       int sum =0 ;
       double avg = 0;
       String m ;
       char hak ;

       int[] a = new int[3];
        String h ;
        String m2 = "%s의 점수입력 ";
        System.out.print(" 이름 입력 해라 : ");
        name = s.nextLine();

        for (int i = 0; i < a.length ; i++) {
            if ( i== 0 ) h= "국어";
            else if (i==1) h= "영어";
            else h="수학";
            System.out.printf(m2,h);
            a[i] = s.nextInt();
            sum += a[i];
        }

        avg = sum/ a.length;
        if (avg >= 90) hak ='A';
        else if (avg >=80) hak = 'B';
        else if (avg >=70) hak = 'C';
        else if (avg >=60) hak = 'D';
        else hak = 'F';

        switch (hak){
            case  'A':
            case  'B':
                m = "참 잘했어요~~";
                break;
            case  'C':
            case  'D':
                m= "조금만 더 노력하세요";
                break;
            case  'F':
                m = "다음 학기에 재수강 ㅅㄱ ~ ";
                break;
            default:
                m = "그냥 이상함 제적 ㅅㄱ ";
                break;
        }

        System.out.println("이름 : " + name);
        System.out.println("국어 : " +a[0]+"점, 영어 : " +a[1]+"점, 수학 : " +a[2] );
        System.out.println("총점 : " + sum + "점, 평균 :"+ avg);
        System.out.println("학점 : "+ hak);
        System.out.println(m);


    }
}

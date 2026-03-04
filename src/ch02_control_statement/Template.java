package ch02_control_statement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

public class Template {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String present, message , name , ys;
        int grade;
        ArrayList<String> at = new ArrayList<>();
        at.add(0, "건물");
        at.add(1, "쓰레기");
        at.add(2, "방사능 폐기물");


        System.out.print("이름 : ");
        name = s.nextLine();

        System.out.print("( 1 ~ 3 )등급 : ");
        grade = s.nextInt();
        present = at.get(grade-1).toString();

        System.out.println(" 랜뽑 ㄱ?  yes or no ");
        ys=
        message = " %s의 선물은 %s 임 ㅅㄱ ";
//       grade.toUpperCase();

        System.out.printf(message, name, present);


    }
}

package ch04_class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class ProductMain_02 {
    static void main() {
        Product_02.brand="농심";
        Scanner s = new Scanner(System.in);

        Date date= new Date();
        SimpleDateFormat smdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String date_ =  smdf.format(date);
        Product_02 pr02 = new Product_02();
        System.out.print("등록할 상품명 : ");
        String data = s.nextLine();

        pr02.setter(data);
        pr02.brand="noongsim";
        System.out.println(pr02.brand);
        System.out.print("등록할 상품 가격 : ");
        int p = s.nextInt();
        pr02.setter(p);
        pr02.setter_date(date_);

        pr02.getter();
//        System.out.println();
//        System.out.println("\n\n\n\n\n\n\n");
//
//        Test_01 t1 = new Test_01();
//        t1.setter("홍길동");
//        t1.setter(10, 20, 30);
//        t1.getter_Print_resualt();
//
//        System.out.print("이름 입력 : ");
//        String name =s.next();
//        System.out.print("나이 입력 : ");
//        int age =s.nextInt();
//
//        System.out.print("생년월일 (@@년 @@월 @@일) 입력 : ");
//        String brd_date = s.next();
//
//        User user = new User(name, age, brd_date);
//
//        System.out.print("성별 입력 (남성 =1 여성 =0): ");
//        int sex = s.nextInt();
//
//        if(sex ==1)name="남성";
//        else name ="여성";
//        user.set_sex(name);
//
//
//
//        user.profile_user();
//        System.out.println("이름 변경? y or n  : ");
//        String rename = s.next();
//
//        switch (rename){
//            case "yes": case "y": case"Yes": case "YES":
//                System.out.print("변경할 이름 입력 :");
//                name = s.next();
//                user.rename_set(name);
//                break;
//            default:
//                System.out.println("이름을 변경하지 않음");
//                break;
//        }
//
//        user.rename_set("홍길동");



    }
}

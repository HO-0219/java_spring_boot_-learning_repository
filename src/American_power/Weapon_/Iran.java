package American_power.Weapon_;

import java.util.ArrayList;
import java.util.List;

public class Iran {
    static void main() {
        List<Weapon> B2_Bomber = new ArrayList<>();
        B2_Bomber.add(new BunkerBuster("GBU-57A","벙커버스터",30000 ,20.5,"3.5톤급",2,60.5) );
        B2_Bomber.add(new Nuclear("B61","핵",700,3.58,"0.3~40만톤급",16,0.8,3,8));
        B2_Bomber.add(new Nuclear("B83","핵",2400,3.67,"120만톤급",16,13.3,7,20));


        for (Weapon item : B2_Bomber){

            System.out.println("===================================================================================================================");
            if(item instanceof  BunkerBuster ) {
                ((BunkerBuster) item).weaponInfo();
            } else if (item instanceof Nuclear) {
                ((Nuclear)item).weaponInfo();
            }



            System.out.println("===================================================================================================================");
        }


    }
}

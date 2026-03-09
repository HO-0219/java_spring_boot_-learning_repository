package ch03_Array;


public class Array02 {
    static void main() {
        //bts 멤버들을 초기화 기법으로 풀어 보세요
//        String[] bts = {" 진", "뷔", "정국", "rm", "지민", "슈가", "제이홉"};

        String[][] at = {{"진","뷔","정국"},{"rm","지민","수기"},{"제이홉"}};
        for (int i = 0; i <  at.length; i++) {
            for (int j = 0; j <at[i].length ; j++) {
                System.out.print(at[i][j]+"    ");
            }
            System.out.println("\n ");
        }
    }
}

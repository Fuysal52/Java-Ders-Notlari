package Ders05_IfStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b) {System.out.println("a b'den buyuktur");} // 10<20 mi false bu yuzden calismaz

        if (a<100) {
            System.out.println("a 100'den kucuk"); } // 10<100 dogru oldugu icin calisir

        if (b>0){
            System.out.println("b 0'dan buyuktur");} // 20,0 'dan buyuk oldugu icin true calsiir



    }
}

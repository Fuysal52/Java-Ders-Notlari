package Ders07_TernaryOperator_SwitchStatements;

public class C06_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan alinan deger
        // 100 den buyuksa sayiyi 2 ile carpin
        // 100'e esit veya kucukse 10 ekleyin

        int input = 45;


        input= input>100 ? input*2 : input+10;
        System.out.println(input);
    }
}

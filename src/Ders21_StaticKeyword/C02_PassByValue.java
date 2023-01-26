package Ders21_StaticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        // fiyat uzerinden %10 indirim yapip indirimli fiyati donduren bir method olusturun
        int fiyat=100;
        System.out.println(indirimYap10(fiyat)); //90
        System.out.println(fiyat); // 100
    }

    public static int indirimYap10 (int fiyat){
        fiyat=fiyat*90/100;

        return fiyat;
    }
}

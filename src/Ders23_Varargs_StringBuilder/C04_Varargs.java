package Ders23_Varargs_StringBuilder;

public class C04_Varargs {
    public static void main(String[] args) {

        // Argument olarak tamsayilar alip, ilk argument haric geriye kalanlari toplayip
        // bulunan toplami ilk argument ile carpip sonucu yazdiran bir method yazdirin
        // not: argument sayisi degisken olabilir

        islemYap(3,6,7,8,7); // 84
        islemYap(4,7,8,9,9,9); // 168
        islemYap(4); //0
        islemYap(1,6); // 6
    }

    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {

        int geriyeKlanlarToplami=0;
        for (int each:geriyeKalanlar
             ) {
            geriyeKlanlarToplami+=each;
        }
        System.out.println(geriyeKlanlarToplami*ilkSayi);
    }
}

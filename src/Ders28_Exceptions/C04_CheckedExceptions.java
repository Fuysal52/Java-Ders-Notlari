package Ders28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/Ders28_Exceptions/metin.txt");

        /*
        Bazi kodlari yazdigimizda Java compile time sirasinda o kodlarda exception riskini gorur
        ve bizden bir cozum bekler.
        Ozellikle dosya okuma ve yazma ile ilgili IO (Input/Outout) islemlerinde Java ya okuyamazsam ya
        yazamazsam diyerek bizden compile time da czoum ister

        bu durmda biz exception ile karsilasildiginda
        kod dursun diyorsa: method satirina keyword kullanarak
                          beklenilen exception(lar) deklare edebiliriz.
                          Bu olayin sadec farkinda oldugumuzu deklare eder exception firlatmanin ve kodu
                          durdurmanin onune gecmez
        kod calismaya devam etmesi icin: try-catch-(finally) blogu kullanabiliriz.


         */
    }

}


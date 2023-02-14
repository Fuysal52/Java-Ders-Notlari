package Ders28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultibleCheckedExceptions {
    public static void main(String[] args) {

        // metin txt dosyasindaki yazilari yazdiralim

        /*
        eger birden fazla catch cumlemiz varsa ve exceptionlar arasinda parent-child iliskisi varsa

        1- ikisini de yazmak istiyorsak , once child exception, sonra parent yazilmalidir
        aksi taktirde parent usste olursa, tum exceptionslarida yakalayacagi icin child exc. yazmak anlamsiz olur

        2- iksiinide yazmak istemezsek, sadece parent exc. yeterli olur cunku parent daha kapsayicidir ve daha cok
        exception yakalar.

         */

        try {
            FileInputStream fis = new FileInputStream("src/Ders28_Exceptions/metin.txt");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package Ders24_StringBuilder_AccessModifier;

public class EncapsuleClass {


        // java class uyelerine erisimin write ve read olarak ayrilmasi istendiginde encapsulation kullanir
        // bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir
        // sonra istedigimiz yetkiyi verecek public method olustururuz

        private int halkaAcikSayi = 10; // herkese acik olsun
        private int satis ; // satis bolumunden deger girilebilisin ama degeri gorunmesin
        private  int toplamSatis=0;  // gorulebilisin ama degistirilemesin


        public void setSatis(int satis) {
                this.satis = satis;
                toplamSatis+=this.satis;
        }

        public int getHalkaAcikSayi() {
                return halkaAcikSayi;
        }

        public void setHalkaAcikSayi(int halkaAcikSayi) {
                this.halkaAcikSayi = halkaAcikSayi;
        }

        public int getToplamSatis() {
                return toplamSatis;
        }



}

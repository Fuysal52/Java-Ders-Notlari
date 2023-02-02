package Ders24_StringBuilder_AccessModifier;

public class C05_Encapsulation {
    public static void main(String[] args) {

        // access modifier bir class uyesine erisimi sinirlandiriken
        // gorme yetkisi(read) ve degistirme yetkisini(write) ayirt edemez
        // ama gercek hayatta bu ihtiyac vardir
        // bazi class uyelerinin readable olmasi istenirken
        // bazi class uyelerinin writeable olmasi istenir
        // bazilari icin iki yetki istenir
        // java bu yetkilendirme isleni icin encapsulation ile cozmustur

        EncapsuleClass obj1 = new EncapsuleClass();
        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);

        System.out.println(obj1.getToplamSatis()); // 600

        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi()); // 400

    }
}

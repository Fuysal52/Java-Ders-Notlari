package Ders25_Inheritance;

public class BDoktor extends APersonel {
    /* olusturdugumuz doktor class'inda isim soyisim gb tum ozelliklerin olmasini istiyoruz
     Personel class'inda olusturulan tum ozelliklerin olmasini istiyoruz
     Bu duurmda 2 tercih var.
     1-istenen ozellikleri doktor class'inda yeniden olusturabilirsiniz
     2- Doktor class'ini Personelin child'i yapmak
     Doktor class'ini Personel class'inin child'i yaptigimizda Doktor classindan olusturdugumuz objeler sadece
     kendi classlarindaki ozelliklere sahip olmaz ayni zamanda parent class daki olan personeldeki ozelliklere de
     sahip olurlar


    */

    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim = "Kemal";
        dok1.soyIsim = "Bulut";

        System.out.println(dok1.isim +","+ dok1.soyIsim +"," +dok1.telefon); // Kemal,Bulut,Telefon atanmadi
        dok1.maas(); // Doktor maasi 30*8*25 :6000
        dok1.ozelSigorta(); // Tum personel ozel saglik sigortasi yaptirilir
        dok1.nobet(); // Doktorlar haftada 1 gun nobet tutarlar
    }

    public void maas (){
        System.out.println("Doktor maasi 30*8*25 :" + 6000 );
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutarlar");
    }
}


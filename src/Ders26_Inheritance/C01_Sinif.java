package Ders26_Inheritance;

class Okul {
    String okulIsmi = "Yildiz koleji";
    String telefon = "3124563421";
}

public class C01_Sinif extends Okul{

    String sinif = "11-C";
    String telefon = "3123453222";

    C01_Sinif(String telefon){

        System.out.println(telefon); // 4332312323
        System.out.println(this.telefon); // 3123453222
        System.out.println(super.telefon); // 3124563421


        System.out.println(okulIsmi); // Yildiz koleji
        System.out.println(this.okulIsmi); // Yildiz koleji
        System.out.println(super.okulIsmi); // Yildiz koleji

        System.out.println(sinif); // 11-C
        System.out.println(this.sinif); // 11-C
        // System.out.println(super.sinif); // super.sinif class ve scope atla direk parent git demektir.
        // ama parent te sinif olmadigi icin CTE verir
        // Java parent te bulamadigini gidip child a sorayim olmaz. geri donus yoktur
    }

    public static void main(String[] args) {

        C01_Sinif obj = new C01_Sinif("4332312323");
    }

}

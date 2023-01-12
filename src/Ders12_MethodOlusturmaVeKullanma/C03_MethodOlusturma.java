package Ders12_MethodOlusturmaVeKullanma;

public class C03_MethodOlusturma {
    public static void main(String[] args) {

        // asagidaki verilen sayilarin faktoryellerini hesaplayiniz

        faktoryelYazdir(5);
        faktoryelYazdir(4);
        faktoryelYazdir(3);
    }

    public static void faktoryelYazdir (int i){
        int carpim = 1;

        for (int j = 1; j <=i ; j++) {
            carpim *= j;
        }
        System.out.println(i + "! = :" + carpim);
    }

}



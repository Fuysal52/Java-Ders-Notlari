package Ders27_Overriding;

public class GExceptions {
    public static void main(String[] args) {

        int a=20;
        int b=0;

        // bolen sayinin 0 olmasi bu kodda ongorulebilecek bir risktir
        // ve kodumuzu yazarken bu riski cozecek sekilde kod yazabiliriz

        if (b!=0){
            System.out.println("Iki sayinin bolumu: " + a/b);
        } else {
            System.out.println("Bolecek sayi sifir olmaz");
        }

    }
}

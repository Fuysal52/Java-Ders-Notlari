package Ders27_Overriding;

public class CAvciKuslar extends BKuslar{
    protected void hareket(){
        System.out.println("Ucarlar");
    }
    protected void beslenme(){
        System.out.println("Et yerler");
    }
    protected void pence(){
        System.out.println("Pencelidirler");
    }
    protected void gaga(){
        System.out.println("Sivri gagalidirlar");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1 = new CAvciKuslar();

        krt1.hareket(); // c == Ucarlar
        krt1.beslenme(); // c ==Et yerler
        krt1.pence(); // c == Pencelidirler
        krt1.gaga(); // c == Sivri gagalidirlar

        krt1.kanat(); // b == Kanatlidirlar
        krt1.solunum(); // b == Akcigerle nefes alirlar
        krt1.cogalma(); // b == Yumurtayla cogalirlar

        krt1.omur(); // a == Yasar ve olurler


        BKuslar krt2 = new CAvciKuslar();

        krt2.hareket(); // c == Ucarlar
        krt2.beslenme(); // c ==Et yerler
        // krt2.pence(); // BKuslar veya parent class'da yok... CTE olur
        krt2.gaga(); // c == Sivri gagalidirlar

        krt2.kanat(); // b == Kanatlidirlar
        krt2.solunum(); // b == Akcigerle nefes alirlar
        krt2.cogalma(); // b == Yumurtayla cogalirlar

        krt2.omur(); // a == Yasar ve olurler

        AHayvanlar krt3 = new CAvciKuslar();

        krt3.hareket(); // c == Ucarlar
        krt3.beslenme(); // c ==Et yerler
        // krt3.pence(); // AHayvanlarda yok=== CTE
        // krt3.gaga(); // AHayvanlarda yok=== CTE

        // krt3.kanat(); // AHayvanlarda yok=== CTE
        krt3.solunum(); // b == Akcigerle nefes alirlar
        krt3.cogalma(); // b == Yumurtayla cogalirlar

        krt3.omur(); // a == Yasar ve olurler





    }
}

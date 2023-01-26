package Ders21_StaticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks (){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
    }


    // static bloklar main methoddan bile once calisir
    // methodlarin ve statik blocklarin java acisindan onemli degildir
    // ancak birden fazla varsa once ussteki calisir
    // static block ta istediginiz bir varianle baslangic degeri atanmasi , kullanicidan bilgi sorgulamasi
    // yapmak icin kullanilir


    static {
        System.out.println("Static blocks calisti");
    }
    static {
        System.out.println("Alttaki static blok calisti");
    }
}

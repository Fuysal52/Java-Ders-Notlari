package Ders23_Varargs_StringBuilder;

public class C03_Varargs {
    public static void main(String[] args) {

        // Kac tane string argument yazilirsa yazilsin
        // Argumentlerin en uzun olanini yazdiran bir method olusturun
        // not: en uzun kelime olarak birden fazla kelime varsa ilkini yazdirin

        enUzunuYazdir("Ilyas","Berivan","Murat","Ali","Nurcan","Java","Huseyin");

    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime = kelimeler[0];

        for (String eachKelime: kelimeler
             ) {

            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}

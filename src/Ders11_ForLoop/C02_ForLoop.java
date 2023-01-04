package Ders11_ForLoop;

public class C02_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen bir String'de index'i tek olanlari kucuk
        // cift olanlari buyuk harf ile yazdirin
        // ornek : java output: JaVa

        String input = "Java candir, Selenium heyecandir";

        for (int i = 0; i < input.length(); i++) {
            System.out.print(i % 2 == 0 ? input.substring(i, i + 1).toUpperCase() : input.substring(i, i + 1).toLowerCase());
            // Ternary Methodu
        }
    }
}

package Ders06_IfElseStatements;

import java.util.Scanner;

public class C15_NestedIfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan artik yil olup olmadigini kontrol etmek icin yil giriniz
        // Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        // Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        // Kural 3 : 4 un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
        // 400 un kati olan yillar artik yildir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil>0 && yil < 400) {
            if (yil % 4 == 0 && yil % 100 != 0) {
                System.out.println("Artik yildir");
            } else {
                System.out.println("Artik yil degildir");
            }
        } else if (yil >= 400) {
            if (yil % 4 == 0 && yil % 400 == 0) {
                System.out.println("Artik yildir");
            } else {
                System.out.println("Artik yil degildir");
            }
        } else if (yil <= 0) {
            System.out.println("Gecersiz yil girisi");
        }
    }
}

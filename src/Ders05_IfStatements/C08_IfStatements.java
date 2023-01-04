package Ders05_IfStatements;

import java.util.Scanner;

public class C08_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir sayi aliniz
        // pozitif ise " Pozitif sayi"
        // 100 ile 999 arasinda ise " Pozitif uc basamakli sayi"
        // uc ile bolunebiliyorsa "uc'un kati"
        // birler basamagi 7 ise "Mukemmel sayi"
        // seceneklerinden uygun olani yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>0) {
            System.out.println("Pozitif sayi");
        }
        if (100<=sayi && sayi<=999) {
            System.out.println("Pozitif uc basamakli sayi");
        }
        if (sayi%3==0){
            System.out.println("uc'un kati");
        }
        if (sayi%10==7){
            System.out.println("Mukemmel sayi");
        }
    }
}

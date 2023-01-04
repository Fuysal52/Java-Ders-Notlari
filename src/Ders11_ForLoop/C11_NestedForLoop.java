package Ders11_ForLoop;

public class C11_NestedForLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunlukarina gore asagidaki sekli cizdirin

        int kisaKenar= 5;
        int uzunKenar= 8;

        for (int i = 1; i <=kisaKenar ; i++) {

            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}


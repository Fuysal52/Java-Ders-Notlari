package Ders17_Arrays;

public class C05_MDA {
    public static void main(String[] args) {

        // Verilen 2 katfli MDA'deki tum sayilarin toplamini yazdiran bir method olusturun

        int [][] arr = {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        tumSayilariTopla(arr);
    }

    public static void tumSayilariTopla (int[][] arr) {

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) { // outer array icin
            for (int j = 0; j <arr[i].length ; j++) { // inner array icin

                toplam+= arr[i][j];
            }
        }
        System.out.println("Array'deki tum sayilarin toplami: " + toplam);
    }
}

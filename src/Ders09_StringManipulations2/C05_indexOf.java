package Ders09_StringManipulations2;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str "cok"iceriyor mu ?

        System.out.println(str.contains("cok")); //  true

        // kullanicidan aldigimiz cok ile baslayan ilk kelimeyi yazdirin.

        System.out.println(str.indexOf('a')); // 1
        System.out.println(str.indexOf('a', 3)); // ????? sor
        System.out.println(str.indexOf("v")); // 2
        System.out.println(str.indexOf("cok")); // 17 "cok"paketinin ilk harfinin old index i yazdirin

        System.out.println(str.indexOf("a", 5)); // 13 --- 5. index'ten sonraki ilk a yi bulmaktir

        // 2. o'nun index'ini yazdirin

        int ilkOindexi =str.indexOf("o"); // 10
        System.out.println(str.indexOf("o",ilkOindexi+1)); // 18
    }

}

package Ders10_StringManipulations3;

public class C04_replaceAll {
    public static void main(String[] args) {


        // bu metindeki sayilardan kurtulun

        String str = "Jav34a 56Gu,87zel-dir";
        str=str.replaceAll("\\d", "");
        System.out.println(str.replaceAll("\\d", "")); // Java Guz,zel-dir

        // ozel karakterlerden de kurtulun

        str=str.replace(" ", "5");
        str=str.replaceAll("\\W", "");
        str=str.replace("5", " ");

        System.out.println(str); // Java Guzeldir

        // buradaki harf sayisini bulalim

        String input= "Ali  Can , Merve Star, Mark Tom";
        input=input.replaceAll("\\W", "");
        System.out.println(input.length()); // 22

    }
}

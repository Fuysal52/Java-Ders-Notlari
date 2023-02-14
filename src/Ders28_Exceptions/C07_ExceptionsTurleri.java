package Ders28_Exceptions;

public class C07_ExceptionsTurleri {
    public static void main(String[] args) {

        String str = "23a";

        // str a sayisal olarak 5 ekleyin

        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayi olmayan bir karakter olursa NumberFormatException   olur


        Object sayiObj = str;

        Integer sayiInt = (Integer)sayiObj;
        System.out.println(sayiInt);
    }
}

package Ders26_Inheritance;

public class DToyota {
    /*
    Data turu olarak parent class secilmesindeki amac child class'dan olusturulan objenin parent class'in tum
    child class'larinin tasidigi ortak ozellikleri vurgulamaktur.

    Data turu ile constructor farkli oldugunda variable ile methodlar farkli davranirlar

    Variable'larin alacagi degeri bulmak icin aramaya data turu olan class dan baslariz
    o class'da yoksa parent class'lara bakariz. ve ilk buldugumuz degeri atama yapariz.
    data turu olan class ve parent lerde yoksa CTE olur

     */

    String marka = "Toyota";
    String model = "Model belirtilmedi";
    String motor = "Motor belirtilmedi";
    String yakit = "Yakit belirtilmedi";
}

package Ders29_Final_AbstractAclasses;

public abstract class DParent {

    // Child classlarin tamaminda method1 ve method2 nin mutlaka olmasini istiyoruz
    // Java parent class'daki istenen methodlari child class'larin overriede etmek zorunda kalmasi icin
    // abstract class'ini olusturmustur.
    // Bir class'i abstrackt yapmak ikstersek class deklarasyonuna abstract yazmak yeterlidir
    // bir abstracht clas in icine child class'larin override etmesi mecburi olan methodlar olabildigi gibi mecburi
    // olmayanlarda olabilir.
    // Child class larin mutlaka override edecegi methodlari da absract yapariz
    // abstract yapilan tum methodlar child classlarin tamaminda overide edileceginden parent classdaki
    // abstract method'un body'ye ihtiyaci olmaz.
    // Java da abstract methodlarin body si olmasina izin vermez.
    // abstract classlarda absrtact methodlar bulundugu icin obje uretilemez

    public abstract void method1();

    public abstract void method2();

    public void method3(){

        System.out.println("Parent class'daki method3 calisti");
    }
}

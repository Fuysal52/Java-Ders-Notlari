package Ders27_Overriding;

public class BKuslar extends AHayvanlar{
    protected void kanat(){
        System.out.println("Kanatlidirlar");
    }
    protected void solunum(){
        System.out.println("Akcigerle nefes alirlar");
    }
    protected void gaga(){
        System.out.println("Gagalari vardir");
    }
    protected void cogalma(){
        System.out.println("Yumurtayla cogalirlar");
    }
}

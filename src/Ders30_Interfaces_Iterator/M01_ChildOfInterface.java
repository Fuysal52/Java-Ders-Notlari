package Ders30_Interfaces_Iterator;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface {

    //  Bir class baska bir class'i extent keyword ile parent edinebilir
    // Ancak birden fazla class'i parent edinemez
    // interface'ler icin boyle bir sinirlamam yoktur
    // Bir class istedigi kadar Interface'i implement edinebilir
    public static void main(String[] args) {

        System.out.println(I02_Interface.SAYI2); //
        System.out.println(I01_Interface.SAYI); //

        I01_Interface.method34(); // static bu sekilde cagrilir

        M01_ChildOfInterface obj = new M01_ChildOfInterface(); // default bu sekilde. once obje olustur sonra cagir
        obj.method44();
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}

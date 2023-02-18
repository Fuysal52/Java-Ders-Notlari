package Ders29_Final_AbstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("parent class'daki mecburi override edilecek method2'i override ettik");

    }

    /*
    Klasik inherintance ile parent child iliskisi olusturdugumuzda Parent class daki tum ozellikleri otomatik
    olarak kazaniriz.
    Ancak method'lari Override etme mecburiyeti yoktur. ister override edip kendimiz ozellestiririz
    Istersek de o parent classdaki haliyle kullaniriz.
     */
    public static void main(String[] args) {

        // DParent obj1 = new DParent() === obje uretilemez

        EChild child1 = new EChild();
        child1.method1();
        child1.method2();
        child1.method3();

        DParent child2 = new EChild();
        child2.method1();
        child2.method2();
        child2.method3();
    }
}

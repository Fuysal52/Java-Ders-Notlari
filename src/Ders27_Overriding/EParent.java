package Ders27_Overriding;

public class EParent extends DGrandParent{

    @Override
    protected void method1() {
        System.out.println("P method1");

        // @Override notasyonu pverridden method ile overriding method 'u iliskilendirilir
        // eger overriden method'da bu iliskiyi bozacak bir degisiklik yapilirsa CTE verir
    }

    protected void method2(){
        System.out.println("P method2");
    }

    private void method3 (){
        System.out.println("P method3");
    }
}

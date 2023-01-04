package Ders03_DataCasting_WrapperClasses;

public class C01_DataCasting {
    public static void main(String[] args) {

        int a =134;
        double b=23.4;
        short c=34;
        byte d=14;

        double e=a;
        int f= c ;
        short g= d;

        short h=(short)b;

        System.out.println("double 23,4'un short karsiligi : "+ h);


        byte l=(byte)a;

        System.out.println("ïnt 134'ún byte karsiligi:"+l);

        int m=(int)b;

        System.out.println("double 23,4ún int karsiligi:"+m);
    }
}

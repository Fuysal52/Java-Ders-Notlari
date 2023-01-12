package Ders10_StringManipulations3;

public class C15_Soru {
    public static void main(String[] args) {

        // asagidaki verilen inputlarin toplamini bulun

        String input1= "15.30 $";
        String input2= "11.40 $";

        input1=input1.replace("$","");
        input2=input2.replace("$","");

        input1=input1.replaceAll("\\s", "");
        input2=input2.replaceAll("\\s", "");

        double input1Double = Double.parseDouble(input1);
        double input2Double = Double.parseDouble(input2);

        System.out.println(input1Double+input2Double + " $ ");

    }
}

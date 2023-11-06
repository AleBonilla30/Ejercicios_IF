import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner Enteros= new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        double Num1= Enteros.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double Num2= Enteros.nextDouble();
        System.out.println("introduce el tercer numero: ");
        double Num3= Enteros.nextDouble();

        if (Num1>=-100 && Num1<=100 && Num2>=-100 && Num2<=100 && Num3>=-100 && Num3<=100) {
            Num1=1/Num1;
            Num2=1/Num2;
            Num3=1/Num3;
            double resultado= Num1+Num2+Num3;

            System.out.println("Los numeros sumados entre ellos es: "+resultado);

        }
        else {
            System.out.println("Algunos de los numero no esta entre -100 y 100");
        }





    }
}

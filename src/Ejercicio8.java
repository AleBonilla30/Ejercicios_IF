import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner Enteros= new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int Num1= Enteros.nextInt();
        System.out.println("Introduce el segundo número: ");
        int Num2= Enteros.nextInt();
        System.out.println("Introduce el tercer Numero: ");
        int Num3= Enteros.nextInt();


        if (Num1>Num2 ){
            int Temp= Num1;
            Num1=Num2;
            Num2=Num3;
            Num3=Temp;

        }
        if (Num2>Num3){
            int temp= Num2;
            Num2=Num3;
            Num3=temp;
        }
        System.out.println("Los numero ordenados son: "+Num1+" "+Num2+" "+Num3);



    }
}

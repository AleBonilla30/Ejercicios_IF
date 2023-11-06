import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner Num= new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int numero1= Num.nextInt();
        System.out.println("Introduce el segundo numero:");
        int numero2= Num.nextInt();
        System.out.println("Introduce el tercer numero");
        int numero3= Num.nextInt();

        if (numero1+numero2==numero3){
            System.out.println(" El resultado es una suma de dos numeros, Numero1  + Numero2= Numero3 ");

        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }
        System.out.println("El programa ha terminado");
        }



        }





import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner bisiesto= new Scanner(System.in);
        System.out.println("Ingrese el año:");
        int año= bisiesto.nextInt();



        if (año%4==0){

            System.out.println("Es un año bisiesto");
        }
        else {
            System.out.println("No es Bisiesto");
        }
        System.out.println("El programa ha terminado");


    }
}

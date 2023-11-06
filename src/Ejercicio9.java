import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner Numero= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1= Numero.nextInt();
        System.out.println("Introduce el segundos numero");
        int num2= Numero.nextInt();
        System.out.println("Introduce el terce numero");
        int num3= Numero.nextInt();

        if (num1!=num2+1 && num2!= num3+1 ){
            System.out.println("Los numeros son conseutivos");

        }  else {
            System.out.println("Los numeros no son consecutivos");
        }
    }
}

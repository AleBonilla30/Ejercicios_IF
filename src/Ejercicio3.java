import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Entero= new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int numero= Entero.nextInt();
        if (numero%20==0 && numero>-100 && numero<101){
            System.out.println("Es multiplo de 20 y esta entre -100 y 100");
        }
        else if (numero%20==0 && numero>0 && numero<2001) {
            System.out.println("El numero es multiplo de 20 pero no esta entre -100 y 100");
        } else if (numero%2==0 && numero>-100 && numero<101) {
            System.out.println("El numero no es multiplo de 20 y esta entre -100 y 1001");
        }
        else {
            System.out.println("no es multiplo de 20 y no esta entre -100 y 100");
        }

    }
    }


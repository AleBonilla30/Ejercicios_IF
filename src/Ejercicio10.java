import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner Entero= new Scanner(System.in);
        System.out.println("Introduce un número");
        int num= Entero.nextInt();

        if (num%2==0){
            num++;
            System.out.println("El numero es par: " +num);
        }
        else {
            num--;
            System.out.println("El numero es impar: "+num);
        }
    }
}

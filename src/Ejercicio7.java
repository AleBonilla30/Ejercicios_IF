import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner Numero= new Scanner(System.in);
        System.out.println("Introduce un numero de 3 digitos");
        int num= Numero.nextInt();

        if (num%3==0 && num>=100 && num<=900){
            System.out.println("Es un numero armstrong.");
            
        } else if (num>=10 && num<=99) {
            System.out.println("El numero no tiene 3 digitos.");
            
        } else {
            System.out.println("El numero no es armstrong");
        }

    }
}

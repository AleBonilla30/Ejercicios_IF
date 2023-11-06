import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num= leer.nextInt();
        if (num%2==0){
            num=num+2;

            System.out.println("Si es número par: "+num);

        }
        else if (num%3==0) {
            num= num+3;

            System.out.println("El numero es multiplo de 3: "+num);

        } else if (num%5==0) {
            num=num+5;
            System.out.println("El numero es multiplo de 5: "+ num);

        }
        else {
            num++;
            System.out.println("Se incrementa en uno: "+num);
        }
    }
}

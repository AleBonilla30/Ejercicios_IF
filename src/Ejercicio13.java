import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner Fecha= new Scanner(System.in);
        System.out.println("Introduce el dia: ");
        int num= Fecha.nextInt();
        System.out.println("Introduce el mes: ");
        int mes= Fecha.nextInt();
        System.out.println("Introduce el año: ");
        int año= Fecha.nextInt();

        if (num>=1 && num<=31 && mes>=1 && mes<=12 && año>=2020 && año<=2024){

        }
        else if (num>=1 && num<=28 && mes==2) {

        }
        else {
            System.out.println("la fecha es incorrecta");
        }
        System.out.println("La Fecha es correcta ");


    }
}

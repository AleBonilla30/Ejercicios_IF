import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner Fecha= new Scanner(System.in);
        System.out.println("Introduce el dia: ");
        int num= Fecha.nextInt();
        System.out.println("Introduce el mes: ");
        int mes= Fecha.nextInt();
        System.out.println("Introduce el año: ");
        int año= Fecha.nextInt();
        if (num>=1 && num<=30 && mes>=1  && mes<=12 && año<=2023 && año<=2024){
            num++;
            mes=mes;
            año=año;

            System.out.println("La fecha de mañana es: "+num+"/"+mes+"/"+año);
        }
    }
}

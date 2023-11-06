import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner Num= new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1= Num.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2= Num.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3= Num.nextInt();
        System.out.println("Ordenar en orden ascendientes: True/false ");
        boolean elegir= Num.hasNextBoolean();

        if (elegir){
            if (numero1>numero2){
                int temp= numero1;
                numero1=numero2;
                numero2=temp;

            }
            if (numero2>numero3){
                int temp= numero2;
                numero2=numero3;
                numero3=temp;
            }
            else if (elegir){
                if (numero1<numero2){
                    int temp=numero1;
                    numero1=numero2;
                    numero2=temp;
                }
                if (numero2<numero3){
                    int temp= numero2;
                    numero2=numero3;
                    numero3=temp;

                }
            }
            System.out.println("Los enteros ordenados son: "+numero1+" "+numero2+" "+numero3);
        }
    }
}


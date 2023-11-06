import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner Digitos= new Scanner(System.in);
        System.out.println("Introduce un numero de 4 digitos: ");
        int Numero= Digitos.nextInt();

        if (Numero>=1000 && Numero<=9999){
            int Digito1= Numero/1000;
            int Digito2= Numero%1000/100;
            int Digito3= Numero%100/10;
            int Digito4= Numero%10;

            if (Digito1== Digito4 && Digito2==Digito3){
                System.out.println("El numero es Capúcua");

            }
            else {
                System.out.println("El numero no es capúcua");
            }
        }
            else if (Numero>=100 && Numero<=999) {

                System.out.println("El numero No tiene 4 Digitos");
            }





    }
}

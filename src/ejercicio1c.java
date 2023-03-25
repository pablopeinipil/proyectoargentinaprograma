/* Ejercicio 1 c) Utilizando swich while e if para mostrar los numeros pares del 5 al 14 ingresando un numero */

import java.util.Scanner;  /* inicio funcion scanner para ingresar un valor*/
public class ejercicio1c {



    public static void main(String[] args) {

        int inicio1c = (5);
        int fin1c = (14);
        int valor;
        Scanner sc = new Scanner(System.in);


        System.out.print("ingresa 1 para mostar  los numeros par o 2 para mostrar los numeros Impares");

        valor = sc.nextInt();

       switch(valor){
            case 1:
                while (inicio1c <=fin1c) {
                    if (inicio1c % 2 == 0) {
                        System.out.println(inicio1c);

                    }
                    inicio1c++;
                }
                break;

           case 2:
               while (inicio1c <=fin1c) {
                   if (inicio1c % 2 != 0) {
                       System.out.println(inicio1c);

                   }
                   inicio1c++;
               }
               break;

           default:
               System.out.println("ingreso un numero incorrecto vuelva a intentarlo");

        }



        sc.close();

    }
}


import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);






        float ingresos;
        System.out.print("Introduzca ingresos: ");
        ingresos = sc.nextFloat();


        int cant_inmuebles;
        System.out.print("Introduzca cantidad de inmuebles: ");
      cant_inmuebles = sc.nextInt();

        int cant_vehiculos;
        System.out.print("Introduzca cantidad de vehiculos: ");
        cant_vehiculos = sc.nextInt();

        boolean patrimonioextra;
        System.out.print("Posee embarcaciones, aeronaves o activos societarios: ");
        patrimonioextra=sc.nextBoolean();




       if((ingresos>400000)&&(cant_inmuebles>2)&&(cant_vehiculos>2)&&(patrimonioextra==true)){

            System.out.println("pertence al grupo 3 de alto ingresos");
        }

        if ((ingresos>200000 )&& (cant_inmuebles==2)&&(cant_vehiculos==2)&&(patrimonioextra==true)){

            System.out.println("pertence al grupo 2 de medianos ingresos");

        }


        if ((ingresos>50000)&&(cant_inmuebles==1)&&(cant_vehiculos==1)&&(patrimonioextra==false)){

            System.out.println("pertence al grupo 1 de bajos ingresos");

        }
        else if


        ((ingresos<50000)&&(cant_inmuebles==1)&&(cant_vehiculos==1)&&(patrimonioextra==false)){

            System.out.println("no pertenece a ningun grupo de relevancia");

        }



        System.out.println(ingresos);
        System.out.println(cant_inmuebles);
        System.out.println(cant_vehiculos);
        System.out.println(patrimonioextra);






    }
}

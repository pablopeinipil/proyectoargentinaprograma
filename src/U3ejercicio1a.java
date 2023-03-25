public class U3ejercicio1a {

    public static void main(String[] args) {

        String unapalabra = "aeiiou";
        char letra = 'i';
        int contador= (0);
        char posicion;

        for (int i=0; i<unapalabra.length();i++){

            posicion= unapalabra.charAt(i);


            if (posicion == letra)
                contador++;



        }


        System.out.println("para la letra seleccionada : "+letra +"\nse encontro : "+contador+" veces en la palabra examinada");








        }






}
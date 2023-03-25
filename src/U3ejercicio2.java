

public class U3ejercicio2 {
    public static void main(String[] args) {

        char letras []=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','y','z'};
        String texto="hola que tal";
        char letra1='h';
        char letra2='o';
       String abc="abcdefghijklmnopqrstuvwxyz";

        for (int i=0;i<texto.length();i++){



           if ( letra1 == texto.charAt(i))

               texto = texto.replace('h', 'i');

               if (letra2 == texto.charAt(i))


                texto = texto.replace('o', 'z');




        }
        System.out.println(texto);








        }





    }



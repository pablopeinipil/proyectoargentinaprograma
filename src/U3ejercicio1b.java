public class U3ejercicio1b {
    public static void main(String[] args) {
        int a = (10);
        int b = (5);
        int c = (3);

        int primero=0;
        int segundo=0;
        int tercero=0;



            if ((a>b)&&(a>c))
                primero=a;

            if ((b>a)&&(b>c))
                primero=b;
            if ((c>a)&&(c>b))
                primero=c;



            if ((a<b)&&(a>c))
                segundo=a;

            if ((b<a)&&(b>c))
                segundo=b;
            if ((c<a)&&(c>b))
               segundo=c;



            if ((a<b)&&(a<c))
                tercero=a;

            if ((b<a)&&(b>c))
                tercero=b;
            if ((c<a)&&(c<b))
                tercero=c;




        System.out.println(primero);
        System.out.println(segundo);
        System.out.println(tercero);

       int vectornum []=new int[3];
            vectornum[0]=primero;
            vectornum[1]=segundo;
            vectornum[2]=tercero;

            for (int i=0;i<vectornum.length;i++){

            System.out.println("el numero en la posicion :["+i+"] es ="+vectornum[i]);
        }













    }
}

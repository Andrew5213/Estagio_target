package ativ2;

public class fibo {
    public boolean Fib(int recebido) {

        int termo1 = 0;
        int termo2 = 1; //se são dois termos, precisa de duas várias para controlar


        do {
            System.out.print(termo1 + " "); //Está mandando imprimir um dos termos
            if (recebido == termo1)//se tiver o numero ele fala
                return true;
            //  System.out.println("encontrado ");


            int temp = termo1 + termo2;
            termo1 = termo2;
            termo2 = temp;
        } while (termo1 <= recebido);

        System.out.println();

        return false;
    }
}



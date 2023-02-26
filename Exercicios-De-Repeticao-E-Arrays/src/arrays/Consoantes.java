package arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        do{

            System.out.println("Letra: ");
            String letra = teclado.next();

            //o objeto string tem o metodo equalsIgnoreCase,
            // compara "a" com a variavel letra, ignorando maiuscula
            //retornado true ou false
            //! não for vogais
            if (! (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador] = letra; //array consoante na posição contador recebe letra
                quantidadeConsoantes++;
            }

            contador++;

        } while (contador < consoantes.length);


        System.out.println("Consoantes digitadas: ");
        //foreach para cada elemento dentro do array consoantes imprima
        for (String consoante : consoantes){

            //sem o if ira imprimir null
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes digitadas: " + quantidadeConsoantes);
    }
}

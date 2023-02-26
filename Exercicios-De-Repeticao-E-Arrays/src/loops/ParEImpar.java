package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadeNumeros;
        int contador = 0;
        int numero;
        int quantidadePares = 0, quantidadeImpares =0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = teclado.nextInt();

        do {
            System.out.println("Número: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            contador ++;

        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade de números pares : " + quantidadePares);
        System.out.println("Quantidade de números ímpares : " + quantidadeImpares);
    }
}

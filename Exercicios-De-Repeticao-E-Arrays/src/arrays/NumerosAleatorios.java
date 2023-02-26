package arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random(); //classe q gera numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for (int i =0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);//random ate 100
            numerosAleatorios[i] = numero;//numero gerado ira para o vetor
        }

        //não pediu mas esses são os antecessores
        System.out.print("Antecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nNúmeros aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        //sucessor
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }
    }
}

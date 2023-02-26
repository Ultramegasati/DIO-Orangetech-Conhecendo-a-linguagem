package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/


import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador =0;
        int maior = 0;
        int media =0;

        do { //pegando as 5 entradas do teclado
            System.out.println("Digite o número: ");
            numero = teclado.nextInt();

            media +=numero;
            if(numero > maior) maior = numero;//se numero maior que maior; maior seja o numero

            contador +=1;
        } while (contador < 5);

        System.out.println("Média dos números digitados foi: " + (media / 5));
        System.out.println("Número maior digitado foi: " + maior);

    }

}

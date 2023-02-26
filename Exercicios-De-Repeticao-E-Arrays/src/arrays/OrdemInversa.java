package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, -3, 6, 4, 3, 7};
        System.out.println("Tamanho do vetor : " + vetor.length); //tamanho do vetor


        System.out.print("Vetor : ");
        int contador = 0;
        while (contador < (vetor.length)){ //percorrer todo o vetor
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor invertido : ");
        for (int i = (vetor.length -1); i >= 0; i--){ // vetor tem 6 numeros porem 5 posições, por isso vetor.length - 1
            System.out.print(vetor[i] + " ");
        }
    }
}

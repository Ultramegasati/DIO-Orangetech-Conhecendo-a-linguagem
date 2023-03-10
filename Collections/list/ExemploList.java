package list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//Exercício LinkedList no final

        //FORMAS DE CRIAR LIST
//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));//POSIÇÃO

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);//ADICIONANDO NA POSIÇÃO 4 O ELEMENTO 8
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);//POSIÇÃO COM IDEXOF E ELEMENTO
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));//CONTAINS P SABER SE TEM NA LIST, RETORNA BOOLEAN

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());//

        System.out.println("Exiba a menor nota: " + Collections.min(notas));//DA CLASSE COLLECTION O METODO MIN,QUE RECEBE UMA COLLECTION NOTAS

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();//METODO ITERATOR P PERCORRER A LIST
        Double soma = 0d;
        while (iterator.hasNext()) { //HASNEXT SE TEM PROXIMO,COLOCANDO EM SOMA
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));//SIZE QTD DE ELEMENTOS DA LIST

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);//SE NÃO COLOCAR O D, QUE É O ELEMENTO, ELE REMOVE NA POSIÇÃO 0, PQ VIRA INT;;; PRÓXIMA IMPRESSÃO
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);//REMOVE POSIÇÃO 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();//PRÓXIMO ELEMENTO EM NEXT
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());//RETORNA TRUE OU FALSE

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

        System.out.println("Criado uma lista, notas2");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
        System.out.println(notas2.toString());
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2.toString());

    }
}
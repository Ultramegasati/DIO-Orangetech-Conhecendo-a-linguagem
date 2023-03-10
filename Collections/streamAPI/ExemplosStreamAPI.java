package streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(System.out::println);

      //  numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //        numerosAleatorios.forEach(System.out::println); //FOREACH TEM O STREAM

        /*    numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/


        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())    //COLLET OS NUMEROS E COOQUE DENTRO DO SET
                .forEach(System.out::println);  // VAI PEGAR SOMENTE 4 NUMEROS, POIS SET NÃO ACEITA NUMEROS REPETIDOS


//        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());//COLLET OS NUMEROS E COOQUE DENTRO DO SET
//        System.out.println(numerosAleatorios5Primeiros);// VAI PEGAR SOMENTE 4 NUMEROS, POIS SET NÃO ACEITA NUMEROS REPETIDOS


        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
//        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> numerosAleatoriosInteger = //COLOCANDO EM UMA VARIAVEL, OU SEM A VARIAVEL IMPRIMIR COM O FOREACH
                numerosAleatorios.stream()
                .map(Integer::parseInt)     //MAP NÃO TEM NADA A VER COM COLLECTION; RECEBE UMA INTERFACE FUNCTION
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);
                //.forEach(System.out::println);


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)//TRANSFORMANDO A LISTA EM INT
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);


//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
                    //dentro do filter, lambda:

                        // .filter(new Predicate<Integer>(){
                             // @Override
                             //public boolean test(Integer i) {
                             // if(i % 2 == 0 && i > 2)  return true;
                             // return false; }})

//                .collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios1.stream()
//                .average()
//                .ifPresent(System.out::println);

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                //AVERAGE MEDIA
                .ifPresent(System.out::println);//COMO RETORNA UM OPTIONALDOUBLE
        // .ifPresent(v -> System.out.println(v)); //VAI RECLAMAR O LAMBDA PARA CHAMAR O REFERENCE METHOD ( :: )

        System.out.println("Remova os valores ímpares: ");
//        numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
//        System.out.println(numerosAleatorios1);


        //NUMEROSALEATORIOS JA FOI TRANSFORMADA EM INTEGER LINHA 47
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0)); //REMOVEIF RECEBE PREDICATE, É UM METODO DE LIST

        /*numerosAleatoriosInteger.removeIf(new Predicate<Integer>(){
        @Override
        public boolean test(Integer integer){
        if(integer %2 != 0 ) return true;
        return false;
        */
        System.out.println(numerosAleatoriosInteger);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);



        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);


        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;


        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);


        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}


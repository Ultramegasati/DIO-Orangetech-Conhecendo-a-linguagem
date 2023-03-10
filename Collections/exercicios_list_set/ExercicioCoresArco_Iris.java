package exercicios_list_set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;
public class ExercicioCoresArco_Iris {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("amarelo");
        coresArcoIris.add("verde");
        coresArcoIris.add("azul");
        coresArcoIris.add("vermelho");
        coresArcoIris.add("laranja");
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        System.out.println(coresArcoIris + "\n");

        System.out.println("Exibir todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor + "\n");
        }


        System.out.println("Quantidade de cores que o arco-íris tem: " + coresArcoIris.size() + "\n");


        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2 + "\n");


        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("amarelo", "verde", "azul", "vermelho", "laranja", "violeta", "anil"));
        System.out.println(coresArcoIris3);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList + "\n");

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\nRemova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris + "\n");

        System.out.println("Limpando o conjunto: \n");
        coresArcoIris.clear();

        System.out.println("Confirindo se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}

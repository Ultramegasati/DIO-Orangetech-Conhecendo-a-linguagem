public class Principal {
    public static void main(String[] args) {

        //chamando método quadrilátero, sobrecarga
        System.out.println("Exercício quadrilátero:");

        MetodosQuadrilateros.area(3);
        MetodosQuadrilateros.area(5d,5d);
        MetodosQuadrilateros.area(7, 8, 9);
        MetodosQuadrilateros.area(5f,5f);

        System.out.println("\nExercício quadrilátero com retorno");

        //retornos
        double areaQuadrado = MetodosQuadrilaterosComRetorno.area(4);
        System.out.println("A área do quadrado: " + areaQuadrado);

        double areaRetangulo = MetodosQuadrilaterosComRetorno.area(3, 5);
        System.out.println("A área do retângulo: " + areaRetangulo);

        double areaTrapezio = MetodosQuadrilaterosComRetorno.area(3,2,5);
        System.out.println("A área do trapézio: " + areaTrapezio);
    }
}
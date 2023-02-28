public class MetodosQuadrilateros {

    public static void area(double lado){
        System.out.println("A área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("A área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("A área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2){  //se passar os 2 como double não aceita pois ja tem no retângulo
        System.out.println("A área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}

public class Principal {

    public static void main(String[] args) {

        // chamando o metodo da calculadora
        System.out.println("Exercício calculadora: ");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // chamando o metodo da mensagem
        System.out.println("Exercício mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // chamando o metodo de empréstimo
        System.out.println("Exercício empréstimo: ");
        Emprestimo.calcular(1000, Emprestimo.DuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.TresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}

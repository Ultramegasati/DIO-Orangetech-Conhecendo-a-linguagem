package oo.heranca;

class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();       //upcast
        Funcionario vendedor = new Vendedor();     //upcast
        Funcionario faxineiro = new Faxineiro();    //upcast

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //Downcast
        //vai dar erro linha 14, downcast, não utilizar
    }
}

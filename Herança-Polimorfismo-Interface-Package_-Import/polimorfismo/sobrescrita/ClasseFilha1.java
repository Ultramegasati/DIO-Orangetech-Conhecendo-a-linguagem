package polimorfismo.sobrescrita;

class ClasseFilha1 extends ClasseMae{

    @Override  //para sobrescrever
    void metodo1(){
        System.out.println("Método 1 da Classe Filha 1");
    }
}

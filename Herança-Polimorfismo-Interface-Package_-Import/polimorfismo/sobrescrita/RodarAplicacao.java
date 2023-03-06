package polimorfismo.sobrescrita;

class RodarAplicacao {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(),new ClasseFilha2(),new ClasseMae()};

        for (ClasseMae classe : classes){
            classe.metodo1(); //ocorre polimorfismo, menos na ClasseMae
        }

        System.out.println(" ");

        for (ClasseMae classe : classes){
            classe.metodo2();//somente ClasseFlha2 faz polimorfismo
        }

        System.out.println(" ");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();//sobrescrita
    }
}

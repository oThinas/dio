package exercicios.polimorfismo_sobrescrita;

public class Teste {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{
            new ClasseFilha1(),
            new ClasseFilha2(),
            new ClasseMae()
        };

        // Polimorfismo
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");
        
        // Override
        ClasseFilha1 classeFilha1 = new ClasseFilha1();
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        ClasseMae classeMae = new ClasseMae();
        classeFilha1.metodo1();
        classeFilha1.metodo2();
        classeFilha2.metodo1();
        classeFilha2.metodo2();
        classeMae.metodo1();
        classeMae.metodo2();
    }
}

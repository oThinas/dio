package exercicios.funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Não recomendado
        Gerente gerente2 = (Gerente) new Funcionario();
        Vendedor vendedor2 = (Vendedor) new Funcionario();
        Faxineiro faxineiro2 = (Faxineiro) new Funcionario();

        System.out.println("" + gerente + vendedor + faxineiro + gerente2 + vendedor2 + faxineiro2);
    }
}

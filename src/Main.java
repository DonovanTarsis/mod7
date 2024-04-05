public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando Sistema");
        Cliente cliente1 = new Cliente(1234, "marcos", "Rua dos Bobos, 0");
        Cliente cliente2 = new Cliente(2345, "joao", "Rua dos Bobos, 1");
        Funcionario funcionario = new Funcionario(3456, "pedro", "Rua dos Bobos, 2");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(funcionario.toString());

    }
}
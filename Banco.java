import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        String nomePessoa = scanner.nextLine();
        System.out.println("Informe número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        System.out.println("\nConta bancária criada com sucesso.");
        System.out.println("------------------------------");

        ContaBanco contaBanco = new ContaBanco(nomePessoa, numeroConta, saldoInicial);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Oque deseja fazer? ");
            System.out.println("\n1. Depositar valor\n2. Sacar valor\n3. Obter saldo disponível\n4. Sair");
            char escolha = scanner.next().charAt(0);
            
            switch (escolha) {
                case '1':
                System.out.println("Informe o valor que deseja depositar: ");
                    double valorDeposito = scanner .nextDouble();
                    contaBanco.deposito(valorDeposito);
                    break;
                case '2':
                    System.out.println("Informe o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    contaBanco.sacar(valorSaque);
                    break;
                case '3':
                    System.out.println("Saldo disponível "+contaBanco.obterSaldo());
                    break;
                case '4':
                    System.out.println("Encerrando...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                
            }
            
        }
        scanner.close();
    }
}

public class ContaBanco {
    private String nomePessoa;
    private int numeroConta;
    private double saldoInicial;

    public ContaBanco(String nomePessoa, int numeroConta, double saldoInicial) {
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }
    public void deposito(double valor){
        saldoInicial+=valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.");
    }
    public void sacar(double valor){
        if (valor>saldoInicial) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        }else if(valor>5000){
            System.out.println("Valor do saque acima do permitido.");
        }else{
            saldoInicial -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }
    public double obterSaldo(){
        return saldoInicial;
    }
}

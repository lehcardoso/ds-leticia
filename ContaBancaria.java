public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta, float saldoInicial) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public boolean sacar(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}


public class ContaCorrente {

    private Integer numero;
    private double saldo;

    public ContaCorrente(Integer numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }


    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public void transferir(ContaCorrente contaDestino, double valorTransferencia) {
        if(getSaldo()>= valorTransferencia){
            this.saldo = getSaldo() - valorTransferencia;
            contaDestino.depositar(valorTransferencia);
        }
    }

    public void depositar(double valorDeposito) {
        if(valorDeposito>0){
            this.saldo = getSaldo() + valorDeposito;
        }
    }

    public static void transferir(ContaCorrente cOrigem, ContaCorrente cDestino, double valorTransferencia) {
        cOrigem.transferir(cDestino, valorTransferencia);
    }

    @Override
    public String toString() {
        return "{" +
                " numero='" + getNumero() + "'" +
                ", saldo='" + getSaldo() + "'" +
                "}";
    }

}

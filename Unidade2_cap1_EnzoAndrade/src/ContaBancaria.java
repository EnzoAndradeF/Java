public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarSaldo(double saldoDepositado) {
        if (saldoDepositado < 0) {
            System.out.println("Depósito negativo");
        } else {
            saldo += saldoDepositado;
            System.out.println("Saldo atual: " + saldo);
        }

    }

    public void sacarSaldo(double saldoSacado) {
        if (saldoSacado > saldo) {
            System.out.println("Saldo indisponível");
        } else {
            saldo -= saldoSacado;
        }
    }

}

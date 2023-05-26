package Aula005;

public class Banco {

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;

    // Métodos especiais

    public Banco() {
        this.setSaldoConta(0.0);
        this.setStatusConta(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        numConta = n;
    }

    protected String getTipoConta() {
        return this.tipoConta;
    }

    protected void setTipoConta(String t) {
        tipoConta = t;
    }

    private String getDonoConta() {
        return this.donoConta;
    }

    private void setDonoConta(String d) {
        donoConta = d;
    }

    private double getSaldoConta() {
        return this.saldoConta;
    }

    private void setSaldoConta(double s) {
        saldoConta = s;
    }

    private boolean getStatusConta() {
        return this.statusConta;
    }

    private void setStatusConta(boolean sc) {
        statusConta = sc;
    }

    // Métodos personalizados

    public void abrirConta(String t) {

        this.setTipoConta(t);
        this.setStatusConta(true);
        if (t == "cc") {
            this.setSaldoConta(50);
        } else if (t == "cp") {
            this.setSaldoConta(150);
        }

        System.out.println("Conta Aberta com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldoConta() > 50) {
            System.out.println("Sua conta não pôde ser fechada porquê ainda têm dinheiro!");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Sua conta está negativada");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    

    public void depositar(double v) {

        if (this.getStatusConta()) {
            this.setSaldoConta(getSaldoConta() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.donoConta);
        } else {
            System.out.println("impossível depositar nesta conta");
        }

    }

    public void sacar(double v) {

        if (getStatusConta()) {
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);

                System.out.println("Saque realizado com sucesso na conta de " + this.donoConta);
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar");
        }

    }

    public void pagarMensal(){

double v = 0.0;
if(this.getTipoConta() == "cc"){
        v = 12;}else if (this.getTipoConta() == "cp"){
        v = 20;}


if(this.getStatusConta()){
    if(this.getSaldoConta() >= v) {
        this.setSaldoConta(this.getSaldoConta() - v);
        System.out.println("Mensalidade paga com sucesso!");
}else {System.out.println("Saldo insuficiente");}
}else {System.out.println("Impossível pagar");}
    }
}






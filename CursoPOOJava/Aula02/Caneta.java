package CursoPOOJava.Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    } 
    //minuto 13 curso em video
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Impossível rabiscar");
        }
    }
    void tampar() {
        this.tampada = true;

    }
    void destampar() {
        this.tampada = false;
    }
}
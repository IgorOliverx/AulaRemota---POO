package Aula004;

public class Carro {
    
    public String marca;
    public String modelo;
    private String cor;
    private float pneu;
    private boolean parado;
    private boolean andando;

    public Carro(String m, String l, float p) { // Este é um método construtor. Construtores tem o nome de método iguais aos da classe
        
        this.modelo = m;
        this.marca = l;
        this.pneu = p;
        this.parar();
        this.cor = "vermelho";
  
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String l) {
        this.marca = l;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPneu(){
        return this.pneu;
    }
    public void setPneu (float p) {
        this.pneu = p;
    }

    public void parar() {
        this.parado = true;
    }

    public void andar() {
        this.andando = false;
    }
    
    public void status(){
        System.out.println("Sobre o carro:");
        System.out.println("A marca do carro é: "+ this.marca );
        System.out.println("O modelo do carro é: "+ this.modelo );
        System.out.println("O aro do pneu é: "+ this.pneu);
        System.out.println("A cor do carro é: "+ this.cor);
        System.out.println("O carro está andando? "+ this.parado);
    }
}
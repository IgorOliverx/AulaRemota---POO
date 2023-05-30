package Aula006;

import javax.naming.ldap.Control;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos especiais
    public int getVolume() {
        return this.volume;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public boolean getTocando() {
        return this.tocando;
    }
    public void setVolume(int v) {
        this.volume = v;
    }
    public void setLigado(boolean l){
        this.ligado = l;
    }
    public void setTocando(boolean t){
        this.tocando = t;
    }


    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
       this.setLigado(false);
    
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == true) {
        System.out.println("========== MENU ==========");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());    
        System.out.print("Volume "+ this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }
        } else {
            System.out.println("Não é possível abrir o menu com o controle desligado!");
        }
    }

    @Override
    public void fecharMenu() { 
        System.out.println("Fechando o Menu...");
    }


    @Override
    public void maisVolume() {
       if(this.getLigado() == true ) {
        this.setVolume(this.getVolume()+1);
        System.out.println("O seu volume está em "+ this.getVolume());
       }
    
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true) {
            this.setVolume(this.getVolume() - 1);
            System.out.println("O Seu volume está em "+ this.getVolume());
        } else {
            System.out.println("Impossível abaixar volume");
        } 
    
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0 ) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }    
    }

    @Override
    public void play() {
        if(this.getLigado() == true && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("Você deu Play!");
        } else {
            System.out.println("Não consegui reproduzir");
        }
    
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
            System.out.println("Você deu pause! ");

        } else {
            System.out.println("Não Consegui pausar!");
        }
    
    }


   






}

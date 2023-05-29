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
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());    
        System.out.print("Volume "+ this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
            
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
       
    
    }

    @Override
    public void ligarMudo() {
       
    
    }

    @Override
    public void desligarMudo() {
       
    
    }

    @Override
    public void play() {
       
    
    }

    @Override
    public void pause() {
       
    
    }


   






}

package AvFormativa3;

import java.util.Random;
import java.util.Scanner;

public class Vetor {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public int vetor[];
    public int contPar = 0;
    public int contImp = 0;

    public Vetor() {

        int tamanhoVetor = rd.nextInt(1001);
        vetor = new int[tamanhoVetor];

    }

    public void preencher() {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
        }
    }

    public void mostrar(){
        System.out.println("O seu vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+ " ");
        }
        System.out.println();
    }

    public void numPar() {
        System.out.println("Números par:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i]);
            }
        }
    }

    public void numImp() {
        System.out.println("Números Ímpares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i]);
            }
        }
    }

    public int getContPar() {
        return this.contPar;
    }

    public void setContPar(){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0 & i % 2 != 0){
                contPar++; 
            }
        }
            
    }

    public int getContImp(){
        return this.contImp;
    }

    public void setContImp() {
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0 & i % 2 == 0){
                contImp++;
            }
            }
    }
    public void status()  {
        this.setContPar();
        this.setContImp();
        System.out.println("Par na posição Ímpar: "+ contPar);
        System.out.println("Ímpar na posição par: "+contImp);
    }

}



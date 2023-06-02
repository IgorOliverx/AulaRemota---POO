package AvFormativa2;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public int numSorteado;
    public int tentativas;
    public int palpite;

    public Sorteio() {
        
        this.numSorteado = rd.nextInt(1001);
        tentativas = 0;

    }

    public int getNumSorteado(){
        return this.numSorteado;
    }

    public int getTentativas() {
        return this.tentativas;
    }

    public int getPalpites() {
        return this.palpite;
    }


    public void jogar() {

        System.out.println("Por favor, diga seu palpite!");
        this.palpite = sc.nextInt();
        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if(palpite<numSorteado) {
                System.out.println("O número sorteado é maior. tente novamente!");
            } else if(palpite>numSorteado) {
                System.out.println("O número sorteado é menor. Tente novamente!");
            } else {
                System.out.println("É isso aí! Você acertou o número sorteado em " + tentativas + " tentativas.");
            }
        } while (palpite != numSorteado);
    }

        

    }


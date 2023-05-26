package Aula005;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Banco p1 = new Banco();
            p1.setNumConta(27112021);
            p1.setDonoConta("Deyverson");
            p1.abrirConta("cc");
            p1.depositar(100);
            p1.estadoAtual();


            Banco p2 = new Banco();

            p2.setNumConta(30012021);
            p2.setDonoConta("Breno Lopes");
            p2.abrirConta("cp");
            p2.depositar(500);
            p2.sacar(100);
            p2.estadoAtual();


        
            
            




    }
}

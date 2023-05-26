package Aula004;

public class App {
    public static void main(String[] args) {
        Carro a = new Carro("Aventador", "Lamborghini", 37f);
        
       // a.setMarca("Porsche");
        //a.setModelo("Panamera Rx2000 BiTurbo v10 aspirado");
        //a.setPneu(35f);
        a.status();

        Carro b = new Carro ("458 itália", "Ferrari", "32f");
        a.status();


    }
}

package Ex001;


public class App {
    public static void main(String[] args) {

        Aula a1 = new Aula();

        a1.nome = "A descoberta do Brasil";
        a1.conteudo = "Desde a chegada dos portugueses até o fim de seu império";
        a1.duracao = 200;
        a1.modelo = "Sua aula comtempla o formato EAD";
        a1.status();

        Aula a2 = new Aula();

        a2.nome = "O maior time do Brasil";
        a2.conteudo = "Palmeiras ou Palestra Itália";
        a2.duracao = 1999;
        a2.modelo = "Sua aula comtempla o formato presencial";
        a2.status();
        


    }
}

package Ex001;

public class Aula {
    
    String nome;
    String conteudo;
    double  duracao;
    String modelo;


    void status(){
        System.out.println("O nome de sua aula é: "+ this.nome);
        System.out.println("O conteúdo da sua aula é sobre "+ this.conteudo);
        System.out.println("A duração aproximada de sua aula é de "+ this.duracao +" minutos");
        System.out.println("Acerca do modelo de sua aula, ela é "+ this.modelo);
    }



}

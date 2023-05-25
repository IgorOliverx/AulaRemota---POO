package ExerciciosPOO.Exercicio1;

public class Pessoa {
    
    //declaração dos atributos deste objeto

    private String nome;
    private int dataDeNascimento;
    private double altura;
    private int idade;


    //criação dos métodos

    public String getNome() {
        return nome;
    }

    public int getDataDeNascimento(){
        return dataDeNascimento;
    }

    public Double getAltura(){
        return altura;
    }

    public int getIdade() {
        int idade = 0;
        idade = 2023 - dataDeNascimento;
        return idade;
    }

    public void setNome(String temp){
        nome = temp;
        }

    public void setDataDeNascimento(int temp) {
        dataDeNascimento = temp;
    }
    public void setAltura(double temp) {
        altura = temp;
    }

}

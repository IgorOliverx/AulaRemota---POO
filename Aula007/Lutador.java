package Aula007;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double al,double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    //tente fazer todos os metodos tudo sozinho





    public void apresentar() {

    }

    public void status() {

    }

    public void ganharLuta() {

    }

    public void perderLuta() {

    }

    public void empatarLuta() {

    }
}
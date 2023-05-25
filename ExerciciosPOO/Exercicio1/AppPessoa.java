package ExerciciosPOO.Exercicio1;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa();
        
        ana.setNome("Ana Machado da Silva");
        ana.setDataDeNascimento(1999);
        ana.setAltura(1.60);

        System.out.println(ana.getNome());
        System.out.println(ana.getIdade());
        System.out.println(ana.getDataDeNascimento());
        System.out.println(ana.getAltura());
    }
    
}

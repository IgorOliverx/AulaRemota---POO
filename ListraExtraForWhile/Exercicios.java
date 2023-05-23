package ListraExtraForWhile;

import java.util.Scanner;

public class Exercicios {
    
    Scanner sc = new Scanner(System.in);
    
    
    public void exercicio1() {

        System.out.println("Digite o seu nome de usúario:");
        String nomeUsuario = sc.nextLine();
        String senha;

        for (;;) {
            System.out.println("Digite sua senha:");
            senha = sc.nextLine();

            if (!senha.equals(nomeUsuario)) {
                break;
            }

            System.out.println("Por favor, insira uma senha diferente da do seu usúario. Tente novamente");

            
        }

        System.out.println("Nome de usuário:" + nomeUsuario);
        System.out.println("Senha de usuário: "+ senha );

    }

    public void exercicio2() {

        System.out.println("Vou ler e validar algumas de suas informações, vamos começar.");

        String nome;
        int idade;
        int salario;
        String sexo;
        String estadoCivil;

        System.out.println("Qual o Seu nome?");

        for (;;) {

            nome = sc.nextLine();

            if(nome.length()>3) {
                break;
            } else {
                System.out.println("Inválido, tente novamente!");
            }
            
        }

        for(;;) {
            System.out.println("Qual a sua idade?");

            idade = sc.nextInt();

            if(idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Inválido, tente novamente!");
            }
        }

        for(;;) {
            System.out.println("Qual o seu salário?");

            salario = sc.nextInt();

            if(salario > 0) {

                break;

            } else {
                System.out.println("Inválido, tente novamente!");
            }
        }

        for(;;) {
            System.out.println("Qual o seu sexo? f - feminino e m - masculino");

            sexo = sc.nextLine();
            if (sexo == "f" || sexo == "m") {
                break;
            } else {
                System.out.println("Inválido, tente novamente!");
            }
        }
        for(;;) {
            System.out.println("Qual o seu estado civil? s - solteiro; c - casado; v - vuivo; d - ");

            estadoCivil = sc.nextLine();
            if (estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "s" || estadoCivil == "d") {
                break;
            } else {
                System.out.println("Inválido, tente novamente!");
            }
        }

        System.out.println("Informações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
    }

    public void exercicio3 () {

        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;

        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;

        int anos = 0;
        for (;;) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;

            if (populacaoA >= populacaoB) {
                break;
            }
        }

        System.out.println("Número de anos necessários: " + anos);
        }

        public void exercicio4(){

            System.out.println("PAÍS A");
            System.out.println("Informe a população:");
            int populacaoA = sc.nextInt();
            System.out.println("Informe a taxa de crescimento anual");
            double taxaCrescimentoA = sc.nextDouble();

            System.out.println("PAÍS B");
            System.out.println("Informe a população:");
            int populacaoB = sc.nextInt();
            System.out.println("Informe a taxa de crescimento anual");
            double taxaCrescimentoB = sc.nextDouble();

        int anos = 0;
        for (;;) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;

            if (populacaoA >= populacaoB) {
                break;
            }
        }

        System.out.println("Número de anos necessários: " + anos);
        }

        public void exercicio5() {
            
        }

    }


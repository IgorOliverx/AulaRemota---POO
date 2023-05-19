import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println(
                "Sou um Software que identificará valores inteiros lidos e os classificarei como > ou < que 10");

        System.out.println(
                "Por favor,digite um número:");
        int valor = sc.nextInt();

        if (valor > 10) {
            System.out.println("O VALOR É MAIOR QUE 10!");
        } else {
            System.out.println("O VALOR NÃO É MAIOR QUE 10!");
        }

    }

    public void exercicio2() {

        System.out.println(
                "Sou um Software que irá calcular suas horas de trabalho de forma mensal, além de seu salário e horas extras!");

        Double salarioHora = 100.00; // Defini 100 como salárioHora
        Double salExtra;
        Double salFinal;

        System.out.println("Por favor, informe quantas horas você trabalhou este mês!");

        int horas = sc.nextInt();

        System.out.println("Agora, informe a quantidade de horas extras feita!");

        int horasExtra = sc.nextInt();

        if (horas > 200) {

            salExtra = salarioHora + (salarioHora * horasExtra / 2);
            salFinal = (salarioHora * horas) + salExtra;

            System.out
                    .println("Você trabalhou " + horas + " horas este mês, assim o seu salário será de: R$" + salFinal);
            System.out.println("Salário: R$" + salFinal);
            System.out.println("Salário por Hora: R$" + salarioHora);
            System.out.println("Horas trabalhadas: " + horas);
        } else {
            salFinal = horas * salarioHora;

            System.out.println("Você trabalhou " + horas + " este mês, assim o seu salário será de: R$" + salFinal);
            System.out.println("Salário: R$" + salFinal);
            System.out.println("Salário por Hora: R$" + salarioHora);
            System.out.println("Horas trabalhadas: " + horas);

        }

    }

    public void exercicio3() {
        System.out.println("Sou um software que calculrá seu salário final com base nas comissões de suas vendas");
        System.out.println("Por favor, informe o seu salário fixo");
        int salarioFixo = sc.nextInt();
        int salarioFinal;
        System.out.println("Ok! Agora informe o valor das vendas que fez:");
        int valorVenda = sc.nextInt();
        if (valorVenda > 2500) {
            salarioFinal = salarioFixo + (5 / 100 * valorVenda);

            System.out.println("O seu salário este mês será de: R$" + salarioFinal);

        } else {
            salarioFinal = salarioFixo + (3 / 100 * valorVenda);
            System.out.println("O seu salário este mês será de: R$" + salarioFinal);

        }

    }

    public void exercicio4() {
        System.out.println("Por favor, informe o número da sua conta: ");
        int numConta = sc.nextInt();
        System.out.println("Por favor, informe o saldo da sua conta: ");
        int saldoConta = sc.nextInt();
        System.out.println("Por favor, informe o débito da sua conta: ");
        int debitoConta = sc.nextInt();
        System.out.println("Por favor, informe o crédito da sua conta: ");
        int creditoConta = sc.nextInt();

        int saldoAtual = saldoConta - debitoConta + creditoConta;

        System.out.println("O seu saldo atual é de: R$" + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("SALDO POSITIVO");

        } else {
            System.out.println("SALDO NEGATIVO");
        }
    }

    public void exercicio5() {
        System.out.println("Informe 3 valores e eu o direi qual o maior deles");
        System.out.println("Valor 1:");
        int valor1 = sc.nextInt();
        System.out.println("Valor 2:");
        int valor2 = sc.nextInt();
        System.out.println("Valor 3:");
        int valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {

            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é: " + valor2);
        } else if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O maior valor é: " + valor3);
        }
    }

    public void exercicio6() {
        System.out.println("Bem-vindo ao posto online!");
        System.out.println("Aqui estão os preços: Álcool = R$3,90 || Gasolina = R$5,30");

        System.out.println("Digite a quantidade em Litros e o Combustível desejado!");

        System.out.println("Quantidade desejada em Litros");
        int litros = sc.nextInt();

        System.out.println("Combustível desejado G ou A     -  Sendo G para gasolina e A para álcool");

        Double precoLitro;
        String combustivel = sc.next();

        if (combustivel.equalsIgnoreCase("G")) {
            precoLitro = 5.30;
            if (litros > 20) {
                precoLitro = 4.982;
            } else {
                precoLitro = 5.088;
            }
        } else if (combustivel.equalsIgnoreCase("A")) {
            precoLitro = 3.90;
            if (litros > 20) {
                precoLitro = 3.705;
            } else {
                precoLitro = 3.783;
            }
        } else {
            System.out.println("Indisponível");
            return;
        }

        Double valorPago = litros * precoLitro;

        System.out.println("O valor a ser pago é de R$"+ valorPago);


    }

    public void exercicio7() {

        System.out.println("Olá! Bem-vindo ao caixa on-line!");
        System.out.println("Por favor, qual o nome do produto?");
        String nome = sc.nextLine();
        System.out.println("Quantas unidades deste produto você adquiriu?");
        int quantidade = sc.nextInt();
        System.out.println("Informe o preço do produto");
        Double preco = sc.nextDouble();

        Double precoTotal = quantidade*preco;

        Double desconto;

        if (quantidade<=5) {
            desconto = precoTotal * 0.02;
        }else if (quantidade <=10) {
            desconto = precoTotal * 0.03;
        }else {
            desconto = precoTotal * 0.05;
        }

        Double precoPagar = precoTotal - desconto;

        System.out.println("Nome do produto: "+ nome);
        System.out.println("Total: R$"+preco);
        System.out.println("Desconto: R$"+ desconto);
        System.out.println("Total a pagar: R$"+ precoPagar);


    }
}

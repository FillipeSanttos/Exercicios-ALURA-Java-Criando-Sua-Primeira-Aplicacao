import java.util.Scanner;

public class Desafio5Diversos {
        public static void main(String[] args) {
            Scanner escaneamentoDeTeclado = new Scanner(System.in);

//1-Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

            System.out.println("DETECTAR NÚMERO: Escreva um número positivo ou negativo:");
            double digiteUmNumero = escaneamentoDeTeclado.nextDouble();
            if (digiteUmNumero > 0) {
                System.out.println("Seu número " + digiteUmNumero + " é um número positivo.");
            } else {
                System.out.println("Seu número " + digiteUmNumero + " é um número negativo.");
            }

//2-Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
            System.out.println("COMPARATIVO DE NÚMEROS: escreva o primeiro número:");
            double primeiroNumero = escaneamentoDeTeclado.nextDouble();
            System.out.println("COMPARATIVO DE NÚMEROS: escreva o segundo número:");
            double segundoNumero = escaneamentoDeTeclado.nextDouble();

            if (primeiroNumero==segundoNumero){
                System.out.println("Os dois números são iguais. Número 1 = "+primeiroNumero+" Número 2 = "+segundoNumero);
            } else if (primeiroNumero>segundoNumero) {
                System.out.println("O primeiro número é maior que o segundo número. Número 1 = "+primeiroNumero+" Número 2 = "+segundoNumero);
            } else {
                System.out.println("O primeiro número é menor que o segundo número. Número 1 = "+primeiroNumero+" Número 2 = "+segundoNumero);
            }

//3-Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
            System.out.println("CÁLCULO DE ÁREA: de qual figura você quer calcular a área? Digite 1 para QUADRADO ou 2 para CÍRCULO.");
            int escolhaParaCalculo = escaneamentoDeTeclado.nextInt();

            if (escolhaParaCalculo==1){
                System.out.println("Qual o valor do lado do quadrado?");
                double valorParaCalculo = escaneamentoDeTeclado.nextDouble();
                double valorDaArea = (valorParaCalculo*valorParaCalculo);
                System.out.println("O valor da área é: "+valorDaArea);

            } else {
                System.out.println("Qual o valor do raio do círculo?");
                double valorParaCalculo = escaneamentoDeTeclado.nextDouble();
                double valorDaArea = (3.14*valorParaCalculo*valorParaCalculo);
                System.out.println("O valor da área é: "+valorDaArea);
            }

//4-Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
            System.out.println("TABUADA. A tabuada de qual número você quer ver?");
            int tabuada = escaneamentoDeTeclado.nextInt();
            String exibicaoTabuada = """
                                Tabuada do %d
                                    01 x %d = %d
                                    02 x %d = %d
                                    03 x %d = %d
                                    04 x %d = %d
                                    05 x %d = %d
                                    06 x %d = %d
                                    07 x %d = %d
                                    08 x %d = %d
                                    09 x %d = %d
                                    10 x %d = %d
                                """.formatted(tabuada,tabuada,1*tabuada,tabuada,2*tabuada,tabuada,3*tabuada,tabuada,4*tabuada,tabuada,5*tabuada,tabuada,6*tabuada,tabuada,7*tabuada,tabuada,8*tabuada,tabuada,9*tabuada,tabuada,10*tabuada);
            System.out.println(exibicaoTabuada);

//5-Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
            System.out.println("NÚMERO PAR OU ÍMPAR? Escreva um número inteiro:");
            int numeroParOuImpar = escaneamentoDeTeclado.nextInt();
            double restoDivisao = (numeroParOuImpar%2);

            if (restoDivisao==0){
                System.out.println("Seu número é par! Número escolhido: "+numeroParOuImpar);
            } else {
                System.out.println("Seu número é ímpar! Número escolhido: "+numeroParOuImpar);
            }

//6-Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
            System.out.println("FATORIAL! Escreva um número inteiro para cálcular seu fatorial:");
            int calculoFatorial = escaneamentoDeTeclado.nextInt();
            int textoNumeroFatorial = calculoFatorial;
            int valorFatorial = 1;

            while (calculoFatorial !=1) {
                valorFatorial = calculoFatorial*valorFatorial;
                calculoFatorial--;
            }

            System.out.println("O valor do fatorial de "+textoNumeroFatorial+" é "+ valorFatorial);
        }
}

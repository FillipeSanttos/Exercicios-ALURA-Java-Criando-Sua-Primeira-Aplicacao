/*
Desafio 4:
Crie um programa que simula um jogo de adivinhação,
Gerar um número aleatório entre 0 e 100
Pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor
do que o número gerado.
*/

import java.util.Random;
import java.util.Scanner;

public class Desafio4JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner digitacaoNoTeclado = new Scanner(System.in);
        int numeroSorteio = new Random().nextInt(100);
        int tentativas = 1;


        while (tentativas < 6) {
            System.out.println("Este é o jogo de adivinhação! Escolha um número de 0 a 100, você tem " + (6-tentativas) + " tentativas restantes:");
            int numeroChute = digitacaoNoTeclado.nextInt();

            if (numeroChute == numeroSorteio) {
                System.out.println("Você acertou na " + tentativas + "° tentativa! O número secreto é " + numeroSorteio);
                break;

            } else {
                if (numeroChute > numeroSorteio) {
                    System.out.println("Seu número é maior que o número secreto!");
                    tentativas++;
                } else {
                    System.out.println("Seu número é menor que o número secreto!");
                    tentativas++;
                }
            }
        }
        if (tentativas == 6) {
           System.out.println("Suas chances acabaram! O número secreto era "+numeroSorteio);
        }
    }
}

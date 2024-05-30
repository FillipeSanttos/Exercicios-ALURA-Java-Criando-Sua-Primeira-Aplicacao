/* Desafio: Crie um programa que simula uma conta bancária

    FEATURES NECESSÁRIOS:
    1-Consultar Saldo
    2-Receber Valor
    3-Transferir Valor
    4-Sair
    !=4-Opção Inválida

    DADOS DO CLIENTE
    Nome: escolher (aleatório)
    Tipo de Conta: escolher (Poupança, Corrente, Investimentos)
    Saldo Inicial: gerado (aleatorio)

 */

import java.util.Random;
import java.util.Scanner;

public class Desafio6ContaBancaria {
    public static void main(String[] args) {
        Scanner leituraDoTeclado = new Scanner(System.in);
        double saldoBancario = new Random().nextInt(10000);
        boolean tipoDeContaEscolhido = false;
        boolean contaCadastrada = false;
        String tipoDeContaNome="Tipo da Conta";

        System.out.println("Bem Vindo ao BANCO ALURA! Vamos criar uma nova conta para você. Qual o seu nome completo?");
        String nomeDoCliente = leituraDoTeclado.nextLine();

        while (tipoDeContaEscolhido==false) {
        System.out.println(nomeDoCliente+", qual conta você deseja criar?");
        System.out.println("1-Conta Poupança 2-Conta Corrente 3-Conta Investimento 4-Sair");
        int tipoDeConta = leituraDoTeclado.nextInt();
            switch (tipoDeConta) {
                case 1:
                    System.out.println("Certo, de acordo com seu perfil, o Banco ALURA esta te fornecendo um crédito de R$"+saldoBancario+" para iniciar sua conta. Aproveite seu saldo!");
                    tipoDeContaEscolhido = true;
                    contaCadastrada = true;
                    tipoDeContaNome = "Conta Poupança";
                    break;
                case 2:
                    System.out.println("Certo, de acordo com seu perfil, o Banco ALURA esta te fornecendo um crédito de R$"+saldoBancario+" para iniciar sua conta. Aproveite seu saldo!");
                    tipoDeContaEscolhido = true;
                    contaCadastrada = true;
                    tipoDeContaNome = "Conta Corrente";
                    break;
                case 3:
                    System.out.println("Certo, de acordo com seu perfil, o Banco ALURA esta te fornecendo um crédito de R$"+saldoBancario+" para iniciar sua conta. Aproveite seu saldo!");
                    tipoDeContaEscolhido = true;
                    contaCadastrada = true;
                    tipoDeContaNome = "Conta Investimento";
                    break;
                case 4:
                    tipoDeContaEscolhido = true;
                    break;
                default:
                    System.out.println("Digito Inválido");
                    System.out.println();
                    break;
            }
        }

        if (contaCadastrada==true){
            System.out.println("#######################################################");
            System.out.println("Bem vindo ao Banco ALURA!");
            System.out.println("""
                NOME: %s
                TIPO: %s
                SALDO: R$%.2f
                #######################################################
                """.formatted(nomeDoCliente,tipoDeContaNome,saldoBancario));

            while (contaCadastrada==true) {
                System.out.println("""
                Escolha uma Opção:
                1-Consultar Saldo
                2-Receber Valor
                3-Transferir Valor
                4-Sair
                """);
                int opcaoMenu = leituraDoTeclado.nextInt();
                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Seu saldo atual é de R$ %.2f".formatted(saldoBancario));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Qual valor você irá receber?");
                        double valorDeposito = leituraDoTeclado.nextDouble();
                        saldoBancario = saldoBancario+valorDeposito;
                        System.out.println("Seu saldo atual é de R$ %.2f".formatted(saldoBancario));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Qual valor você irá transferir?");
                        double valorTransferencia = leituraDoTeclado.nextDouble();

                        if (valorTransferencia>saldoBancario){
                            System.out.println("Saldo Insuficiente. Transferência cancelada.");
                            System.out.println();
                        } else {
                            saldoBancario = saldoBancario-valorTransferencia;
                            System.out.println("Valor transferido. Seu saldo atual é de R$ %.2f".formatted(saldoBancario));
                            System.out.println();
                        }
                        break;
                    case 4:
                        contaCadastrada= false;
                        break;
                    default:
                        System.out.println("Digito Inválido");
                        System.out.println();
                        break;
                }
            }
        }
        System.out.println("Aplicação Encerrada.");
    }
}
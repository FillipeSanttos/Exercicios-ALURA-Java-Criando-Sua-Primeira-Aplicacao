//Projeto Curso Alura - Screen Match

import javax.print.DocFlavor;
import java.util.Scanner;

public class ScreenMatch {
    public static void main(String[] args) {
        boolean incluidoNoPlano = true;      //Verificando se o usuário tem o plano ou não
        System.out.println("Bem vindo ao Screen Match!");

        Scanner leituraDeTeclado = new Scanner(System.in); //Ativando o Scanner para ler o teclado
        System.out.println("Qual o nome do seu filme preferido?");
        String nomeDoFilme = leituraDeTeclado.nextLine();
        System.out.println("Escreva uma sinopse sobre este filme:");
        String sinopse = leituraDeTeclado.nextLine();
        System.out.println("Qual o ano de lançamento deste filme?");
        int anoDeLancamento = leituraDeTeclado.nextInt();

        double mediaNotaFilme = 0;
        int quantidadeDeNotas = 0;
        double notaDoFilme = 0;

/*        for (int i = 0; i < 3; i++) {      //LOOP USANDO *FOR
            System.out.println("Qual a nota para este filme? Digite 3 diferentes para fazer uma média:");
            notaDoFilme = leituraDeTeclado.nextDouble();
            mediaNotaFilme += notaDoFilme;     //Somar nota anterior com a nota mais recente
            quantidadeDeNotas++;     //Verificar quantas notas foram digitadas no total
        }
*/
        while (notaDoFilme != -1) {      //LOOP USANDO *WHILE
            System.out.println("Digita notas para esse filme, quando quiser parar, digite -1");
            notaDoFilme = leituraDeTeclado.nextDouble();
            if (notaDoFilme != -1) {
                mediaNotaFilme += notaDoFilme;  //Somar nota anterior com a nota mais recente
                quantidadeDeNotas++;       //Verificar quantas notas foram digitadas no total
            }
        }

        if (incluidoNoPlano==true) {
           String todosOsDadosDoFilme = """
                              Nome do Filme: %s
                              Sinopse: %s
                              Ano de Lançamento: %d
                              Nota do Filme: %.1f baseado em %d avaliações
                              """.formatted(nomeDoFilme,sinopse,anoDeLancamento,mediaNotaFilme/quantidadeDeNotas,quantidadeDeNotas);
            System.out.println(todosOsDadosDoFilme);
        } else {
            System.out.println("Você não possuí o plano.");
        }
    }
}
public class Desafio3Diversos {
    public static void main(String[] args){
        //1-Calcular media de duas notas decimais e mostrar!
        double nota1 = 8.7;
        double nota2 = 3.6;
        double media = (nota1+nota2)/2;
        System.out.println("A média é: %.2f".formatted(media));

        //2-Declarar um double e um int, transformar double em int!
        double variavel1 = 8.7;
        int variavel2 = 5;
        System.out.println((int) variavel1);

        //3-Declarar um char e um String, coloque elas na mesma mensagem
        char primeiraPalavra = 'O';
        String segundaPalavra = " desafio.";
        System.out.println(primeiraPalavra+segundaPalavra);

        //4-Declare um double de preço e um int de quantidade. Multiple e mostre o resultado
        double precoDoProduto = 4.86;
        int quantidade = 478;
        double valorEstoque = (precoDoProduto*quantidade);
        System.out.println("O valor total em estoque é R$"+valorEstoque);

        //5-Declare um double de valor em dolar, conversao de 4,94 para real, imprima valor na tela
        double valorEmDolar = 88.75;
        double valorEmReal = (valorEmDolar*4.94);
        System.out.println("O valor de %.2f em dólar equivale a %.2f em real.".formatted(valorEmDolar,valorEmReal));

        //6-Declare um double do preco original de um produto. Declare um double de % de desconto. Imprima valor original, valor desconto e novo valor final
        double valorOriginal = 784.55;
        double percentualDesconto = 34;
        double valorDesconto = (valorOriginal*percentualDesconto/100);
        double valorComDesconto = (valorOriginal-valorDesconto);
        System.out.println("""
                           Valor Original: R$ %.2f
                           Valor do Desconto: R$ %.2f
                           Valor Final: R$ %.2f
                           """.formatted(valorOriginal,valorDesconto,valorComDesconto));
    }
}
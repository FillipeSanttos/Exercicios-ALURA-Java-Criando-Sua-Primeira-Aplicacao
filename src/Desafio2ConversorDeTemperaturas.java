//Desafio 2: Conversor de Temperaturas
public class Desafio2ConversorDeTemperaturas {
    public static void main(String[] args){
        double celsius = 100; //valor em celsius
        double fahrenheit = (celsius * 1.8) + 32; //formula para transformacao em fahrenheit

        System.out.println(celsius+ " graus Celsius são "+fahrenheit+" graus em Fahrenheit."); //forma 1 de fazer

        String mensagemFinal = String.format("%.1f graus Celsius são %.1f graus em Fahrenheit." , celsius , fahrenheit);
        System.out.println(mensagemFinal); //forma 2 de fazer

        int semCasasDecimais = (int) fahrenheit; //converter double para inteiro
        System.out.println("Sem casas decimais fica no valor de "+semCasasDecimais);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");
        
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String sinopse;
        sinopse = """
                Top Gun: Maverick é um filme de ação e aventura lançado em %d, 
                dirigido por Joseph Kosinski. O filme é uma sequência do clássico de 1986, Top Gun
                 """.formatted(anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);

        double media = (9.8 + 6.2 + 8.0) /3;
        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao);


        /////////////////////////////////////////////////////////////////////////////////////////
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);


}



    }


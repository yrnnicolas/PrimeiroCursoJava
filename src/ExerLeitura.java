import java.util.Scanner; //importação da classe Scanner para leitura de dados do usuário


public class ExerLeitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //criação de um objeto Scanner para ler a entrada do usuário
        
        System.out.println("Digite o nome do filme:");
       
        String filme = leitura.nextLine(); //leitura de uma linha de texto para o nome do filme
       
        System.out.println(filme); //exibição do nome do filme digitado pelo usuário
        ////////////////////////////////////////////////////////////////////////////////
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}

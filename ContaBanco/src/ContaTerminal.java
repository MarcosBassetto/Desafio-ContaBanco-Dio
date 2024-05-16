import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe por gentileza o número de sua conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Informe-nos o nome do proprietário da conta:");
        String nomeCliente = sc.next();

        System.out.println("Informe o valor do saldo atual:");
        double saldo= sc.nextDouble();

        new ContaBanco(numero, agencia, nomeCliente, saldo).imprimeUsuario();
    }
}

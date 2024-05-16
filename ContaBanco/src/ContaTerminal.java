import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia; 
    private String nomeCliente;
    private Double saldo;


    public ContaTerminal() {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe por gentileza o número de sua conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Informe-nos o nome do proprietário da conta:");
        String nomeCliente = sc.next();

        System.out.println("Informe o valor do saldo atual:");
        double saldo= sc.nextDouble();

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void imprimeUsuario(){
        System.out.println("Olá "+nomeCliente+", \nObrigado por criar uma conta em nosso banco,\n"+
        "Sua agência é "+agencia+", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");
    }
 
    
}

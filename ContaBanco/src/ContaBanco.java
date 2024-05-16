import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia; 
    private String nomeCliente;
    private Double saldo;


    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {

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

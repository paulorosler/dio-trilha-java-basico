import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor informe seu nome: ");
        String nomeCliente = scanner.next().toUpperCase();
        System.out.println("Qual é o seu sobrenome? ");
        String sobrenomeCliente = scanner.next().toUpperCase();

        String nomeCompletoCliente = nomeCliente + " " + sobrenomeCliente;

        System.out.println("Por favor informe o número da agencia com o dígito: ");
        String numeroAgencia = scanner.next();

        System.out.println("Agora o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual é o valor do depósito inicial?");
        double saldoConta = scanner.nextDouble();

        System.out.println(
            "Olá " + nomeCompletoCliente + 
            ", obrigado por criar uma conta em nosso banco, " +
            "sua agencia é " + numeroAgencia + 
            ", conta " + numeroConta +
            ", e seu saldo de " + saldoConta +
            " já está disponível para saque"   
        );

    }
}

//importando as classes Locale e Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //simulando valor já depositado
        double saldo = 237.48;
        //criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //solicitando as informações do cliente 
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenomeCliente = scanner.next();
                     
        //imprimindo os dados obtidos pelo cliente
        System.out.println("Olá " + nomeCliente +" " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
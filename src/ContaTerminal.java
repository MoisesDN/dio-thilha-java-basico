import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor, digite o número da Agência! ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite a Agência! ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.print("Por favor, digite o nome do Cliente! ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo! ");
        double saldo = sc.nextDouble();
        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível.");

        sc.close();
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Digite sua nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia e "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque");

        scanner.close();
    }
}

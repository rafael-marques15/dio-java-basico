import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ;

        System.out.println("Por favor, digite o número da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite a sua agência ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite seu saldo atual ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta 10" + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // pede um valor em string para nome
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        // pede um valor em string para sobrenome
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        // pede um valor int para idade
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        // pede um valor double para altura
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}

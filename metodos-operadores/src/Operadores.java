public class Operadores {
    public static void main(String[] args) {

        // Concatenação de valores
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        // Operador unário, o ex baixo é:incremento
        int numero = 5;
        System.out.println(++numero);

        // Operador ternário

        int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // Operadores lógicos && e, || ou.
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira");

        }

    }
}
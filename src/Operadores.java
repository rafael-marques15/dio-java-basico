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
    }
}
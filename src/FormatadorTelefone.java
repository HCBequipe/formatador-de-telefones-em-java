import java.util.Scanner;

public class FormatadorTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FORMATADOR DE TELEFONES ===");
        System.out.println("Digite o número (pode conter espaços, traços ou apenas números):");
        String entrada = scanner.nextLine();

        // Remove tudo o que NÃO for número (letras, espaços, traços, parênteses)
        String apenasNumeros = entrada.replaceAll("\\D", "");

        String resultado = formatar(apenasNumeros);
        System.out.println("\nNúmero Formatado: " + resultado);

        scanner.close();
    }

    public static String formatar(String numeros) {
        switch (numeros.length()) {
            case 8:
                // Fixo sem DDD: 33334444 -> 3333-4444
                return numeros.replaceFirst("(\\d{4})(\\d{4})", "$1-$2");

            case 9:
                // Celular sem DDD: 988884444 -> 98888-4444
                return numeros.replaceFirst("(\\d{5})(\\d{4})", "$1-$2");

            case 10:
                // Fixo com DDD: 1133334444 -> (11)3333-4444
                return numeros.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1)$2-$3");

            case 11:
                // Celular com DDD: 11988884444 -> (11)98888-4444
                return numeros.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");

            default:
                return "Erro: Quantidade de dígitos inválida (" + numeros.length() + " dígitos). Digite 8, 9, 10 ou 11 números.";
        }
    }
}
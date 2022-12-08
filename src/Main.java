import java.util.Scanner;

public class Main {

    public static void fatorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Número para calcular o Fatorial");
        int a = scan.nextInt();
        int reposta = 1;
        for (int i = 1; i <= a; i++){
            reposta *= i ;
        }
        System.out.println("fatorial de " + a + " é " + reposta);
    }

    public static void letrasDuplicadas(){
        String[] duplicates = {"abracadabra", "allottee", "assessee", "kelless", "keenness", "Alfalggo" };
        String[] resultado = new String[duplicates.length];
        System.out.println("Resultado:");
        System.out.print("[");
        for (int i = 0; i < duplicates.length; i++) {
            String atual = duplicates[i];
            StringBuilder sb = new StringBuilder();
            char anterior = 0;
            for (int j = 0; j < atual.length(); j++) {
                char c = atual.charAt(j);
                if (c != anterior) {
                    sb.append(c);
                }
                anterior = c;
            }
            System.out.print(resultado[i] = sb.toString());
            System.out.print(",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        fatorial();
        System.out.println();
        letrasDuplicadas();
    }




}
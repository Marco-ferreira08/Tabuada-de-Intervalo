import java.util.Scanner;

public class TabuadaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📌 Gerador de Tabuada (com intervalo)");

        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int fim = scanner.nextInt();

        // Garante que o início seja sempre menor que o fim
        int menor = Math.min(inicio, fim);
        int maior = Math.max(inicio, fim);

        System.out.println("\n📊 Exibindo tabuadas de " + menor + " até " + maior + ":\n");

        for (int i = menor; i <= maior; i++) {
            System.out.println("🔢 Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Espaço entre as tabuadas
        }

        scanner.close();
    }
}

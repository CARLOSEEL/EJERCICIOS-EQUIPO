import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dólares: ");
        int cantidad = scanner.nextInt();
        int[] denominaciones = { 100, 50, 20, 10, 5, 1 };
        int[] cantidades = new int[denominaciones.length];
        Cambio(cantidad, denominaciones, cantidades);
        System.out.println("Billetes necesarios para " + cantidad + " dólares:");
        for (int i = 0; i < denominaciones.length; i++) {
            System.out.println("Billetes de " + denominaciones[i] + ": " + cantidades[i]);
        }
        scanner.close();
    }
    public static void Cambio(int cantidad, int[] denominaciones, int[] cantidades) {
        for (int i = 0; i < denominaciones.length; i++) {
            cantidades[i] = cantidad / denominaciones[i];
            cantidad %= denominaciones[i];
        }
    }
}

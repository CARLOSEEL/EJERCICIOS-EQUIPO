import java.util.Scanner;

public class Cambio {

    public static double pesosToDollars(double pesos) {
        double exchangeRate = 3898; // Tipo de cambio actual (1 USD = 3,898.48 COP)
        return pesos / exchangeRate;
    }

    public static double dollarsToPesos(double dollars) {
        double exchangeRate = 3898.48; // Tipo de cambio actual (1 USD = 3,898.48 COP)
        return dollars * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de pesos colombianos a convertir a dólares: ");
        double pesos = scanner.nextDouble();

        // Convertir pesos a dólares
        double dollars = pesosToDollars(pesos);
        System.out.println(pesos + " pesos colombianos equivalen a " + dollars + " dólares.");

        System.out.print("Ingresa la cantidad de dólares a convertir a pesos colombianos: ");
        double dollarsToConvert = scanner.nextDouble();

        // Convertir dólares a pesos colombianos
        double pesosConverted = dollarsToPesos(dollarsToConvert);
        System.out.println(dollarsToConvert + " dólares equivalen a " + pesosConverted + " pesos colombianos.");

        scanner.close();
    }
}

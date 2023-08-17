import java.util.Scanner;

public class Operaciones {

    public static double potenciacion(int base, int exponente){
        return Math.pow(base, exponente);
    }

    public static double squareRoot(int num){
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit){
            int opt;
            double res;
            Scanner sc = new Scanner(System.in);

            System.out.println("1.- Potenciacion");
            System.out.println("2.- Raiz cuadrada");
            System.out.println("3.- Salir");
            System.out.print("Ingrese el numero de operacion que desea realizar: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1 -> {
                    int base, exponente;
                    System.out.print("Ingrese la base: ");
                    base = sc.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    exponente = sc.nextInt();
                    res = potenciacion(base, exponente);
                    System.out.println(base + " elevado a la " + exponente + " es igual a " + res);
                }
                case 2 -> {
                    int num;
                    System.out.print("Ingrese el numero que desea obtener su raiz: ");
                    num = sc.nextInt();
                    res = squareRoot(num);
                    System.out.println("La raiz cuadrada de " + num + " es igual a " + res);
                }
                case 3 -> {
                    exit = true;
                    sc.close();
                }
                default -> System.out.println("La opcion ingresada esta fuera de las opciones");
            }

            System.out.println();
        }
    }
}
 
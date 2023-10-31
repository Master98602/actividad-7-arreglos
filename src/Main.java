import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        // Leer 20 números enteros desde el teclado
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un número entero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Número\tCuadrado\tCubo");

        // Calcular y mostrar el cuadrado y el cubo de cada número
        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t" + cubo);
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aperfeicoando {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Digite o numerador: ");
            int valor = scanner.nextInt();

            int resultado = valor / 3;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException => " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            scanner.close(); // Certifique-se de fechar o Scanner para evitar vazamentos de recursos.
        }
    }
}

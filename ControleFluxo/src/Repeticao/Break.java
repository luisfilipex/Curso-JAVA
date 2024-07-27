package Repeticao;

public class Break {

public static void main(String[] args) {
        
        int numero;

        for (numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break; //continue se quiser continuar o loop
        }

        System.out.println(numero);
    }
}
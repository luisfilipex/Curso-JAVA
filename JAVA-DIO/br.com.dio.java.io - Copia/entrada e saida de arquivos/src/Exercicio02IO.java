import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio02IO {
    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes (digite 'Fim' para finalizar): ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        // Correção na criação do objeto File
        File f = new File("recomendações.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true)); // Usar 'true' para acrescentar no arquivo

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();
        } while (!line.equalsIgnoreCase("Fim"));

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());
        pw.close();
        scan.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
}

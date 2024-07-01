import java.io.*;

public class Exercicio03IO {

    public static void copiarArquivo() throws IOException {
        File f = new File("C:/Users/filip/IdeaProjects/br.com.dio.java.io/recomendações.txt");
        String nameArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();

        String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.lastIndexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy));

        while (line != null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        bw.close();

        System.out.printf("Arquivo \"%s\" copiado com sucesso!%n", f.getName());
        System.out.printf("Arquivo \"%s\" criado com sucesso!%n", fcopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 Livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        System.out.printf("Ok! tudo certo. Tamanho do arquivo %d bytes.%n", fcopy.length());
        pw.close();
    }

    private static void adicionarInfoNoArquivo(String name) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(name, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("Fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}

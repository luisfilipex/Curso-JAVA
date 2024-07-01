import java.io.*;

public class ExercicioRecomendacao {

    public static void copiarArquivo() throws IOException {
        File f = new File("C://Users//filip//IdeaProjects//br.com.dio.java.io//recomendações.txt");

        if (!f.exists()) {
            System.out.println("O arquivo original não existe.");
            return;
        }

        String nomeArquivo = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.lastIndexOf(".")) + "-copy.txt";
        File fCopy = new File(f.getParent(), nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fCopy));

        int byteData;
        while ((byteData = bis.read()) != -1) {
            bos.write(byteData);
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso, e está no diretorio %s com %d bytes.%n",
                fCopy.getName(), fCopy.getPath(), fCopy.length());
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}

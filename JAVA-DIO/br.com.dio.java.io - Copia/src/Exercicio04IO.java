import java.io.*;
import java.util.Scanner;

public class Exercicio04IO {

    public static void incluirProduto() {
        File f = new File("C:/Users/filip/IdeaProjects/peca-de-roupa.bin");

        try (PrintStream ps = new PrintStream(System.out);
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
             Scanner scan = new Scanner(System.in)) {

            ps.print("Nome da peça: ");
            String nome = scan.nextLine();
            dos.writeUTF(nome);

            ps.print("Tamanho da peça (P/M/G/U): ");
            char tamanho = scan.next().charAt(0);
            dos.writeChar(tamanho);

            ps.print("Quantidade de peças: ");
            int quantidade = scan.nextInt();
            dos.writeInt(quantidade);

            ps.print("Preço unitário: ");
            double preco = scan.nextDouble();
            dos.writeDouble(preco);

            lerProduto(f.getPath());
            System.out.println("\nPedido cadastrado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void lerProduto(String caminhoArquivo) throws IOException {

        File f = new File(caminhoArquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome........: %s\n",nome);
        System.out.printf("\nTamanho........: %s\n",tamanho);
        System.out.printf("\nQuantidade........: %s\n",quantidade);
        System.out.printf("\nPreço........: %s\n",preco);
        System.out.println("Total do valor das peças: " + (quantidade * preco));

        dis.close();

    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}

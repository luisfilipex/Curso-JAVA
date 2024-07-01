import java.io.*;

public class Gato implements Serializable {
    private String nome;
    private int idade;
    private String cor;

    // Construtor da classe Gato
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public static void serealizacao() throws IOException {
        Gato gato = new Gato("Simba", 6, "Amarelado");

        File f = new File("gato.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             PrintStream ps = new PrintStream(System.out)) {

            oos.writeObject(gato);
            ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho: %d bytes%n", f.getName(), f.length());
        }
    }

    public static void deserealizacao() throws IOException, ClassNotFoundException {
        File f = new File("gato.ser");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
             PrintStream ps = new PrintStream(System.out)) {

            Gato gato = (Gato) ois.readObject();
            ps.println("Gato desserializado:");
            ps.println("Nome: " + gato.nome);
            ps.println("Idade: " + gato.idade);
            ps.println("Cor: " + gato.cor);
        }
    }

    public static void main(String[] args) {
        try {
            serealizacao();
            deserealizacao();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.util.*;

public class ordenacao { // Nome da classe deve começar com maiúscula por convenção
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Atirador", "Fantasia", 25));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Inserção\t");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 45));
            add(new Serie("Atirador", "Fantasia", 25));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Natural (tempo episodio)\t");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }

    static class Serie implements Comparable<Serie> {
        private String nome;
        private String genero;
        private int tempoEpisodio;

        public Serie(String nome, String genero, int tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public int getTempoEpisodio() {
            return tempoEpisodio;
        }

        public void setTempoEpisodio(int tempoEpisodio) {
            this.tempoEpisodio = tempoEpisodio;
        }

        @Override
        public String toString() {
            return "Serie{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return tempoEpisodio == serie.tempoEpisodio &&
                    Objects.equals(nome, serie.nome) &&
                    Objects.equals(genero, serie.genero);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            return Integer.compare(this.tempoEpisodio, serie.tempoEpisodio);
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal01 {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "111990";
        String driverBanco = "org.postgresql.Driver";
        String instrucao_insert = "INSERT INTO PESSOAS(id, nome) VALUES (?, ?)";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement sentenca = conexao.prepareStatement(instrucao_insert);

            sentenca.setInt(1, 5);
            sentenca.setString(2, "Lucas"); // TROCAR ID NO DE CIMA E NOME AQUI PARA ADICIONAR NO BANCO

            int linhasAfetadas = sentenca.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Inserção realizada com sucesso");
            } else {
                System.out.println("Falha na inserção");
            }

            conexao.close();
        } catch (Exception exception) {
            System.out.println("Erro na conexão com banco de dados");
            exception.printStackTrace();
        }
    }
}

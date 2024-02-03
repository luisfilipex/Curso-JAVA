import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RemocaoUsuario {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "111990";
        String driverBanco = "org.postgresql.Driver";
        String instrucao_delete = "DELETE FROM PESSOAS WHERE id = ?";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement sentenca = conexao.prepareStatement(instrucao_delete);

            int idParaRemover = 3; // ID DO USUARIO PRA REMOVER
            sentenca.setInt(1, 4);

            int linhasAfetadas = sentenca.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Remoção realizada com sucesso");
            } else {
                System.out.println("Falha na remoção. Usuário não encontrado ou já removido.");
            }

            conexao.close();
        } catch (Exception exception) {
            System.out.println("Erro na conexão com banco de dados");
            exception.printStackTrace();
        }
    }
}

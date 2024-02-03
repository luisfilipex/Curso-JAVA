import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "111990";
        String driverBanco = "org.postgresql.Driver";
        String instrucaoUpdate = "UPDATE pessoas SET nome=? WHERE ID=?";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoUpdate);

            preparedStatement.setString(1, "Carlos"); // TROCAR O NOME PARA ATUALIZAR O CADASTRO
            preparedStatement.setInt(2, 4); // TROCAR O ID PARA ATUALIZAR

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Atualização realizada com sucesso");
            } else {
                System.out.println("Falha na atualização. Nenhum registro encontrado para o ID especificado.");
            }

            conexao.close();
        } catch (Exception exception) {
            System.out.println("Erro na conexão com banco de dados");
            exception.printStackTrace();
        }
    }
}

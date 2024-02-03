import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaPorId {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "111990";
        String driverBanco = "org.postgresql.Driver";
        String instrucao_select = "SELECT id, nome FROM PESSOAS WHERE id = ?";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            int idParaConsulta = 3; // Substitua pelo ID desejado
            PreparedStatement sentenca = conexao.prepareStatement(instrucao_select);
            sentenca.setInt(1, idParaConsulta);

            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");

                System.out.println("ID: " + id + ", Nome: " + nome);
            }

            conexao.close();
        } catch (Exception exception) {
            System.out.println("Erro na conexão com banco de dados");
            exception.printStackTrace();
        }
    }
}

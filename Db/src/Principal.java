import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Principal {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "111990";
        String driverBanco = "org.postgresql.Driver";
        String instrucaoSelect = "SELECT * FROM pessoas"; 

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            Statement sentenca = conexao.createStatement();
            
            ResultSet rs = sentenca.executeQuery(instrucaoSelect);
            
            while(rs.next()) {
            	int id = rs.getInt("id");
            	String nome = rs.getString("Nome");
            	System.out.println("Id: " + id + " - Nome: " + nome);
            }
            
            System.out.println("Conexão realizada com sucesso");
            conexao.close(); 
        } catch (Exception exception) {
            System.out.println("Erro na conexão com banco de dados");
            exception.printStackTrace();
        }
    }
}

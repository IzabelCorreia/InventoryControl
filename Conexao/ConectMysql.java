package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectMysql implements Conexao{

    private final String USUARIO = "root";
    private final String SENHA = "*****";
    private final String URL = "jdbc:mysql://localhost:3306/Dados";
    private Connection conectar;

    public Connection obterConexao() throws SQLException {
        
        try{
            if(conectar == null){
                conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
            else{
                System.out.println("Conexão bem-sucedida ");
                conectar.close();
            }
        }catch(SQLException e){
            System.out.println("Falha na conexão");
        }
        return conectar;
    }
}

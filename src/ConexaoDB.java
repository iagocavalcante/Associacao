
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDB {

    private static Connection conexao;

    static {
        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/DB_Associacao", "root", "root");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado!",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Os seguintes erros foram encontrados:\n" + sqlex,
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println(sqlex);

        }
    }
    
    public static Connection getConexao(){
        return conexao;
        
    }
}

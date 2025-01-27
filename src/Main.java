import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres?user=postgres.nfydjimxiaiusfortioo&password=MendiMendiMendiArmend");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
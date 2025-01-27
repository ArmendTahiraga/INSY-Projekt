import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres?user=postgres.nfydjimxiaiusfortioo&password=MendiMendiMendiArmend";
        String query = "select * from books order by title asc";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String uuid = resultSet.getString("uuid");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String publishedAt = resultSet.getString("published_at");
                String author_uuid = resultSet.getString("author_uuid");

                System.out.println("--------------------");
                System.out.println("Uuid: " + uuid);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
                System.out.println("Published At: " + publishedAt);
                System.out.println("Author Uuid: " + author_uuid);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
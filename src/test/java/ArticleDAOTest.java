import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class ArticleDAOTest {

    public static final String HOST = "jdbc:mysql://localhost:3306/library";
    public static final String USER = "library";
    public static final String PASSWORD = "library@1848";
    public static final String ERROR = "Connection failed";
    public static final String INSERT = "INSERT INTO article_data (title, brief, content) VALUES (?,?,?)";

    @Test
    void should_connect_to_database() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD)){
            if (con == null){
                Assertions.fail(ERROR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail("Connection failed");
        }
    }

    @Test
    void should_insert_read_delete_item_in_database() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD);
                final PreparedStatement insert = con.prepareStatement(INSERT);
                final PreparedStatement select = con.prepareStatement("SELECT * FROM article_data")){

            insert.setString(1, "Java EE");
            insert.setString(2, "Learning Java Fast");
            insert.setString(3, "It's complete book for learning java.");
            insert.executeUpdate();

            ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                String title = resultSet.getString("title");
                String brief = resultSet.getString("brief");
                String content = resultSet.getString("content");

                System.out.println(title +  brief + content);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail("Connection failed");
        }
    }
}

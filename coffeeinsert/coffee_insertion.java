import java.sql.*;
import java.util.Properties;
public class coffee_insertion {
    public static void main(String[] args) {
        Connection dbConnection = null;

        try {
            // Database connection
            String url = "jdbc:mysql://localhost/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database 'test'");
            }

            // SELECT query
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\n--- Coffee Table Contents ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("%d, %s, %d\n", id, coffee_name, price);
            }

            rs.close();
            st.close();

            // INSERT query using PreparedStatement
            String insertQuery = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
            stmt.setString(1, "Tajmahal");
            stmt.setInt(2, 950);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("\nNew coffee record inserted successfully.");
            }

            stmt.close();

        } catch (SQLException ex) {
            System.err.println("An SQL exception occurred!");
            ex.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected exception occurred!");
            e.printStackTrace();
        } finally {
            try {
                if (dbConnection != null && !dbConnection.isClosed()) {
                    dbConnection.close();
                    System.out.println("Database connection closed.");
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

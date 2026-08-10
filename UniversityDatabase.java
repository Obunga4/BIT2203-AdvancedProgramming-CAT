import java.sql.*;

public class UniversityDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/university_db";
    private static final String USER = "admin";
    private static final String PASSWORD = "secure123";

    public static void main(String[] args) {
        String createTable = "CREATE TABLE IF NOT EXISTS courses (" +
                "course_id INT PRIMARY KEY, " +
                "course_name VARCHAR(100), credits INT, department VARCHAR(50))";

        String insertCourse = "INSERT INTO courses " +
                "(course_id, course_name, credits, department) VALUES (?, ?, ?, ?)";

        String selectCourses = "SELECT * FROM courses WHERE department = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTable);

            try (PreparedStatement ps = connection.prepareStatement(insertCourse)) {
                ps.setInt(1, 101);
                ps.setString(2, "Advanced Programming");
                ps.setInt(3, 3);
                ps.setString(4, "Computer Science");
                ps.executeUpdate();

                ps.setInt(1, 102);
                ps.setString(2, "Database Systems");
                ps.setInt(3, 3);
                ps.setString(4, "Computer Science");
                ps.executeUpdate();

                ps.setInt(1, 103);
                ps.setString(2, "Computer Networks");
                ps.setInt(3, 3);
                ps.setString(4, "Information Technology");
                ps.executeUpdate();
            }

            try (PreparedStatement ps = connection.prepareStatement(selectCourses)) {
                ps.setString(1, "Computer Science");
                ResultSet result = ps.executeQuery();

                while (result.next()) {
                    System.out.println(
                        result.getInt("course_id") + " | " +
                        result.getString("course_name") + " | " +
                        result.getInt("credits") + " | " +
                        result.getString("department"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
package orm.data_mapper_and_identity_map.mappers;

import orm.data_mapper_and_identity_map.entities.User;

import java.sql.*;

public class UserMapper implements Mapper<User> {

    private static Connection connection;
    private static Statement statement;

    public User findOneById(Integer id) {
        User user = new User();
        String sql = String.format("SELECT * " +
                "FROM users WHERE id = '%d';", id);
        try {
            connect();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
            }
            disconnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void save(User user) {
        String sql = String.format("INSERT INTO users (name, age) " +
                "VALUES ('%s', %d);", user.getName(), user.getAge());
        try {
            connect();
            statement.execute(sql);
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void update(Integer id, User user) {
        String sql = String.format("UPDATE users SET name = '%s', age = '%d' WHERE id = '%d';",
                user.getName(), user.getAge(), id);
        try {
            connect();
            statement.executeUpdate(sql);
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        String sql = String.format("DELETE FROM users WHERE id = '%d';", id);
        try {
            connect();
            statement.execute(sql);
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:src/main/java/orm/data_mapper_and_identity_map/db/example.db");
        statement = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

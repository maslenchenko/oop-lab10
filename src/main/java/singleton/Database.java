package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Database{

    private static Connection connection = null;
    private static Database db = null;

    private Database() {
        connect();
    }

    private static void connect(){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Desktop\\2-year-ucu\\oop\\lab10\\singleton\\usersdb.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static Database getConnection(){
        if (db == null) {
            db = new Database();
            return db;
        }
        return db;
    }

    public void add(User user){
        try {
            String sql = "INSERT INTO users(name, age, email) VALUES (?, ?, ?);";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            pstmt.setString(3, user.getEmail());
            pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("User added to usersdb successfully");
    }
}
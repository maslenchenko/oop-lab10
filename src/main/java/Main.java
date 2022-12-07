import singleton.Database;
import singleton.User;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getConnection();
        User user = new User("Oles", "dobosevych@ucu.edu.ua", 31);
        database.add(user);
    }
}
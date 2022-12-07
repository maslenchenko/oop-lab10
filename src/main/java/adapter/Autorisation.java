package adapter;

public class Autorisation extends Авторизація {
    public boolean autorize(adapter.Database db) {
        db.getUserData();
        return true;
    }
}

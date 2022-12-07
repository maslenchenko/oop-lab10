package adapter;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Autorisation a = new Autorisation();
        if (a.autorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}

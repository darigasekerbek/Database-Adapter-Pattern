public class DatabaseAdapter extends OldDatabase {
    private final NewDatabase newDB;
    DatabaseAdapter(NewDatabase newDB){
        this.newDB = newDB;
    }
}

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        NewDatabase newDB = new NewDatabase();
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(newDB);
        databaseAdapter.fetchPatientData("12345");
        newDB.retrievePatientInfo("67890");

    }
}
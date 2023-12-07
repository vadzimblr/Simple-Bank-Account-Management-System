package bsu.vadzimblr.BankAccountManager.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomDBConnectionManager {
    private final static String urlDB ="jdbc:postgresql://localhost:5432/BankDB";
    private final static String userDB = "postgres";
    private final static String passwordDB = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlDB,userDB,passwordDB);
    }

}

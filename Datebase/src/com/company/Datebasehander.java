package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Datebasehander extends Conaigs{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void singUpUser(String user, String idusers, String Name, String Surname,
                           String Login, String gender, String password, int age) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.USERS_NAME + ","
                + Const.USERS_SURNAME + "," + Const.USERS_LOGIN + "," + Const.USERS_PASSWORD + "," + Const.USERS_GENDER + "," + Const.USERS_AGE + ")" +
                "Values (?,?,?,?,?,?)";
        PreparedStatement prSt = getDbConnection().prepareStatement(insert);


        try {
            prSt.setString(1, Name);
            prSt.setString(2, Surname);
            prSt.setString(3, Login);
            prSt.setString(4, password);
            prSt.setString(5, gender);
            prSt.setInt(6, age);
            prSt.executeLargeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

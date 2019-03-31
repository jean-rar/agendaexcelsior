package br.com.agendaexcelsior.conectionfactory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionFactory {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/Agenda";
    private final String USER = "root";
    private final String PASS = "localhost";

    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new  RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void closeConnection(Connection connection, PreparedStatement statement){

        closeConnection(connection);
        try {

            if(statement!=null){
                statement.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){

        closeConnection(connection, statement);
        try {
            if(resultSet != null){
                resultSet.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

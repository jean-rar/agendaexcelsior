package br.com.agendaexcelsior.conectionfactory;

import java.sql.*;
import java.sql.Connection;

public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Agenda";
    private static final String USER = "root";
    private static final String PASS = "localhost";

    public static Connection getConnection(){
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
            System.err.println("ERRO: " + ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if(statement!=null){
                statement.close();
            }

        } catch (SQLException ex) {
            System.err.println("ERRO: " + ex);
        }
        closeConnection(connection);
    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if(resultSet != null){
                resultSet.close();
            }

        } catch (SQLException ex) {
            System.err.println("ERRO: " + ex);
        }
        closeConnection(connection, statement);
    }
}

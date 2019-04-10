package br.com.agendaexcelsior.dao;

import br.com.agendaexcelsior.conectionfactory.ConnectionFactory;
import br.com.agendaexcelsior.entidades.Ramal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ramalDao {
    Connection connection;

    public ramalDao(){ connection = ConnectionFactory.getConnection(); }

    public boolean inserir (Ramal ramal){
        String SQL = "INSERT INTO Ramal (ramal) VALUES" + " (?,?)";
        PreparedStatement stmt = null;

        try{
            stmt = connection.prepareStatement(SQL);
            stmt.setString(1, ramal.getNumero());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch (SQLException ex){
            System.out.println("Erro " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}

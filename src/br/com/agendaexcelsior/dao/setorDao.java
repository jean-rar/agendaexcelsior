package br.com.agendaexcelsior.dao;

import br.com.agendaexcelsior.conectionfactory.ConnectionFactory;
import br.com.agendaexcelsior.entidades.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class setorDao {
    Connection connection;

    public setorDao(){
        connection = ConnectionFactory.getConnection();
    }

    public boolean inserir (Departamento departamento){
        String SQL = "INSERT INTO Departamento (nome, andar) VALUES" + "(?, ?)";
        PreparedStatement stmt = null;

        try{
            stmt = connection.prepareStatement(SQL);
            stmt.setString(1, departamento.getNomeDepartamento());
            stmt.setString(2, departamento.getNomeAndar());
            stmt.executeUpdate();
            stmt.close();
            return true;
            }catch (SQLException ex){
            System.out.println("Erro! " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}

package br.com.agendaexcelsior.dao;

import br.com.agendaexcelsior.conectionfactory.ConnectionFactory;
import br.com.agendaexcelsior.entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class funcionarioDao {
    Connection connection;

    public funcionarioDao(){
        connection = ConnectionFactory.getConnection();
    }

    public boolean inserir(Funcionario funcionario){
        String SQL = "INSERT INTO Funcionario (nome, ramal) VALUES" + " (?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(SQL);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRamal());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}

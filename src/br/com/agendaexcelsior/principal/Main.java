package br.com.agendaexcelsior.principal;
import br.com.agendaexcelsior.conectionfactory.ConnectionFactory;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        System.out.println("Funcionou");
    }
}

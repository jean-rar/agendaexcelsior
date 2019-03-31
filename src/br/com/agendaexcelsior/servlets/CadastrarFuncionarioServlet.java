package br.com.agendaexcelsior.servlets;

import br.com.agendaexcelsior.entidades.Funcionario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cadastrarFuncionario")
public class CadastrarFuncionarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Cadastrando novo funcionário...");
        String nomeFuncionario = request.getParameter("nome");
        String ramal = request.getParameter("nome");
        String departamento = request.getParameter("nome");
        PrintWriter out = response.getWriter();

        out.println("<html><body>Empresa " + nomeFuncionario + " cadastrado com sucesso</body></html>");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeFuncionario);
        funcionario.setRamal(ramal);
        funcionario.setDepartamento(departamento);
    }

}

package br.com.agendaexcelsior.dao;

import br.com.agendaexcelsior.entidades.Funcionario;
import br.com.agendaexcelsior.entidades.Departamento;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class teste {
    public void inserir(){
        Funcionario funcionario = new Funcionario("jean", "9234");
        funcionarioDao funcionarioDao = new funcionarioDao();
        Departamento departamento = new Departamento("TI", "Terceiro");
        setorDao setorDao = new setorDao();

        if(funcionarioDao.inserir(funcionario)){
            System.out.println("Dados salvos!");
        }else{
            fail("Erro no salvamento!");
        }

        if((setorDao.inserir(departamento))){
            System.out.println("Dados salvos!");
        }else{
            fail("Erro no salvamento!");
        }

    }
    public static void main (String[] args){
        teste teste = new teste();
        teste.inserir();
    }
}

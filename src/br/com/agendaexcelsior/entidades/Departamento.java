package br.com.agendaexcelsior.entidades;

public class Departamento {
    private int id;
    private String nomeDepartamento;
    private String nomeAndar;

    public Departamento(){}
    public Departamento(String nomeDepartamento, String nomeAndar){
        this.nomeDepartamento = nomeDepartamento;
        this.nomeAndar = nomeAndar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeSetor(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeAndar() {
        return nomeAndar;
    }

    public void setNomeAndar(String Nomeandar) {
        this.nomeAndar = nomeAndar;
    }
}

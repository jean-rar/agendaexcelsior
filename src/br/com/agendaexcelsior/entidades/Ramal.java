package br.com.agendaexcelsior.entidades;

public class Ramal {
    private int id;
    private String numero;

    public Ramal(){}
    public Ramal(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

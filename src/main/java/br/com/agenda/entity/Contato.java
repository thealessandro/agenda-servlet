package br.com.agenda.entity;

import java.util.Objects;

public class Contato {

    private String nome;
    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o) return false;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;

        return Objects.equals(getNome(), contato.getNome()) &&
                Objects.equals(getTelefone(), contato.getTelefone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getTelefone());
    }

    @Override
    public String toString() {
        return "Contato {" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

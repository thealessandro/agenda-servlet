package br.com.agenda.repository;

import br.com.agenda.common.IRepo;
import br.com.agenda.entity.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository implements IRepo<Contato> {

    private List<Contato> contatos;

    public ContatoRepository() {
        if (this.contatos == null) {
            this.contatos = new ArrayList<>();
            this.contatos.add(new Contato());
            this.contatos.add(new Contato());
            this.contatos.add(new Contato());
            this.contatos.add(new Contato());
            this.contatos.add(new Contato());
        }
    }

    @Override
    public Contato findOne(int id) {
        return this.contatos.get(id);
    }

    @Override
    public void save(Contato contato) {
        this.contatos.add(contato);
    }

    @Override
    public void delete(int id) {
        this.contatos.remove(id);
    }

    @Override
    public List<Contato> findAll() {
        return this.contatos;
    }
}

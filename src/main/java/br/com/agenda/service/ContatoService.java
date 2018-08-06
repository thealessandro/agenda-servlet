package br.com.agenda.service;

import br.com.agenda.repository.ContatoRepository;

public class ContatoService {

    private ContatoRepository repository;

    public ContatoService() {
        this.repository = new ContatoRepository();
    }
}

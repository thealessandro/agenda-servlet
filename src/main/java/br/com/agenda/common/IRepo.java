package br.com.agenda.common;

import java.util.List;

public interface IRepo<T> {

    T findOne(int id);

    void save(T t);

    void delete(int id);

    List<T> findAll();
}

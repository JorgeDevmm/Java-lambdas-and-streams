package com.project.fundamentals;

import java.util.List;

public interface DatabaseService<T> {

    //Aplicando programación generica
    //methods
    public T getById(Long id);
    public List<T> getAllRecords();



}

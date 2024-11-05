/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.dao;

import java.util.ArrayList;

public interface CrudDAO <T,ID> extends SuperDAO{

    public ArrayList<T> getAll()throws Exception;

    public T get(ID id)throws Exception;

    public boolean add(T entity)throws Exception;

    public boolean update(T entity)throws Exception;

    public boolean delete(ID id)throws Exception;

    public ArrayList<T> search(ID id)throws Exception;

    public String getId() throws Exception;
}

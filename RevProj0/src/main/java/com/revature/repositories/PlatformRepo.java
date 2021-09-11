package com.revature.repositories;

import com.revature.models.Platform;

import java.util.List;

public class PlatformRepo implements CrudRepository<Platform> {

    //Create
    @Override
    public Platform add(Platform platform) {
        return null;
    }

    //Read
    @Override
    public Platform getById(Integer id) {
        return null;
    }

    @Override
    public List<Platform> getAll() {
        return null;
    }

    //Update
    @Override
    public void update(Platform platform) {

    }

    //Delete
    @Override
    public void delete(Integer id) {

    }
}

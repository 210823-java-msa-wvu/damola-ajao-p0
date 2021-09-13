package com.revature.repositories;

import com.revature.models.User;

import java.util.List;

// A generic type is a class or interface that is parameterizes over types.
// We use angle brackets to specify the parameter type
public interface CrudRepository<T> {

    // Create
    T add(T t);

    // Read
    T getById(Integer id);

    List<T> getAll();

    List<User> getAllUser();

    // Update
    void update(T t);

    // Delete
    void delete(Integer id);
}
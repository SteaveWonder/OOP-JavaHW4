package service;

import model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String firstName, String lastName, String middleName);
    List<T> getAll();
}

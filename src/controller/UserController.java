package controller;

import model.User;

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);
}

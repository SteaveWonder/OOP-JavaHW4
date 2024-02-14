package view;

import model.User;

import java.util.List;

public interface UserView<T extends User> {
    void viewOnConsole(List<T> list);
}

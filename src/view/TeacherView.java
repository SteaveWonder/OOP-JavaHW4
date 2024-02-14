package view;

import model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void viewOnConsole(List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println(teacher);
        }
    }
}

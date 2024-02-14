package controller;

import model.Teacher;
import service.TeacherService;
import view.TeacherView;

import java.util.List;

public class TeacherController implements UserController {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.create(firstName, lastName, middleName);
    }

    public List<Teacher> getAllTeacher() {
        return teacherService.getAll();
    }

    public void printAllTeacher() {
        teacherView.viewOnConsole(getAllTeacher());
    }
}

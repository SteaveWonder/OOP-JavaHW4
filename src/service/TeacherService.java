package service;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        int maxId = 0;
        for (Teacher teacher: teachers){
            if (maxId < teacher.getTeacherId()){
                maxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, lastName, middleName, maxId++);
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}

package ru.prospectschool.bot.service;

import org.jvnet.hk2.annotations.Service;
import ru.prospectschool.bot.model.Teacher;

import java.util.*;

@Service
public class TeacherService {

    private final Map<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();

    public TeacherService() {
        teachers.put(0, new Teacher(1, "Mel", "", "", new byte[]{1, 1, 1}));
        teachers.put(0, new Teacher(2, "Jerry", "", "", new byte[]{1, 1, 1}));
        teachers.put(0, new Teacher(3, "", "", "", new byte[]{1, 1, 1}));
    }

    public Collection<Teacher> findAll() {
        return teachers.values();
    }
}

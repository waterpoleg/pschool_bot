package ru.prospectschool.bot.service;

import ru.prospectschool.bot.model.Subject;
import ru.prospectschool.bot.model.SubjectType;
import ru.prospectschool.bot.model.Teacher;

import java.util.*;

public class TeacherService {

    private final Map<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();

    public TeacherService() {
        teachers.put(0, new Teacher(
                0,
                "Mel",
                "",
                0,
                "",
                new ArrayList<>(List.of(
                        new Subject("personal", 2200, SubjectType.PERSONAL),
                        new Subject("group", 1500, SubjectType.KINDER_GROUP),
                        new Subject("group", 1800, SubjectType.ADULT_GROUP)
                ))
        ));
        teachers.put(1, new Teacher(
                1,
                "Jerry",
                "",
                0,
                "",
                new ArrayList<>(List.of(
                        new Subject("personal", 2200, SubjectType.PERSONAL),
                        new Subject("group", 1500, SubjectType.KINDER_GROUP),
                        new Subject("group", 1800, SubjectType.ADULT_GROUP)
                ))
        ));
    }

    public Collection<Teacher> findAll() {
        return teachers.values();
    }
}

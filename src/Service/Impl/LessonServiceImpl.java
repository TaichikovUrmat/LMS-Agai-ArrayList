package Service.Impl;

import Service.LessonService;
import db.DataBase;
import models.GenerateId;
import models.Group;
import models.Lesson;

import java.util.ArrayList;
import java.util.Iterator;

public class LessonServiceImpl implements LessonService {
    DataBase dataBase;

    public LessonServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override

    public void addLessonToGroup(String groupName, Lesson lesson) {
        for (Group group : dataBase.groups) {
            if (group.getGoupName().equalsIgnoreCase(groupName)) {
                lesson.setIdLesson(GenerateId.generateIdLesson());
                group.getLessons().add(lesson);

                System.out.println("Сабак кошулду!");
                return;
            }
        }
        System.out.println("Мындай группа жок!");
    }

    @Override
    public void getLessonsByGroupName(String groupName) {
        for (Group group : dataBase.groups) {
            if (group.getGoupName().equalsIgnoreCase(groupName)) {
                System.out.println(group.getLessons());
                return;
            }
        }
        System.out.println("Мындай группа жок!");
    }

    @Override
    public void getStudentsByLessonName(String lessonName) {
        for (Group group : dataBase.groups) {
            for (Lesson lesson : group.getLessons()) {
                if (lesson.getLessonName().equalsIgnoreCase(lessonName)) {
                    System.out.println(group.getStudents());
                    return;
                }
            }
        }
    }

    @Override
    public void getLessonByName(String lessonName) {
        for (Group group : dataBase.groups) {
            for (Lesson lesson : group.getLessons()) {
                if (lesson.getLessonName().equalsIgnoreCase(lessonName)) {
                    System.out.println(lesson);
                    return;
                }
            }
        }
        System.out.println("Мындай сабак жок!");
    }

    @Override
    public void deleteLessonById(int lessonId) {
        for (Group group : dataBase.groups) {
            for (Lesson lesson : group.getLessons()) {
                if (lesson.getIdLesson() == lessonId) {
                    dataBase.groups.remove(lessonId);
                    System.out.println("Сабак очурулду!");
                    return;
                }
            }
        }
        System.out.println("Мындай сабак жок!");
    }


}



package Service;

import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public interface StudentService {

    void addStudent(String gropupName, Student student);

    void updateStudentByName(String studentName, String newName);

    void findStudentByName(String studentName);
    void getStudentsByGroupName(String groupName);

    void deleteStudentByEmail(String email);
}

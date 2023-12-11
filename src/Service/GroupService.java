package Service;

import models.Group;
import models.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public interface GroupService {

    void addGroup(Group groupName);

    void findGroupByName(String groupName);

    void updateGroupByName(String groupName, String newName);

    void getAllGroups();

    void deleteGroupByName(String groupName);




}

package db;

public class MyId {
    public static long id =  0;
    public static long id2 =  0;
    public static long GroupId(){
        return ++id;
    }
    public static long LessonId2(){
        return ++id;
    }
}

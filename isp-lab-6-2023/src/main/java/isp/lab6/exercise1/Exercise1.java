package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studmap = new HashMap<>();

        studmap.put("ISP", 10);
        studmap.put("TS", 9);
        Student student = new Student("077443564554", "Cena", "John", studmap);
        List<Student> studen = new ArrayList<>();

        studen.add(new Student("999934435", "Theory", "Austin", studmap));
        studen.add(student);

        System.out.println();
        studen.remove(student);
        System.out.println();


    }
    public static void studentAdd(List<Student>student, Student stud){
        student.add(stud);
    }
        public static void studentremove(List<Student> student, Student stu){
        student.remove(stu);

    }
    public static  void studentupdate(List<Student> student, Student st) {

    }
    public  static  void studentaveragenote(List<Student> student, Student studa){

    }

}

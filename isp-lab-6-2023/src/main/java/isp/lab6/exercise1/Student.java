package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String lastname;
    private HashMap<String, Integer> studmap = new HashMap<>();

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studmap=" + studmap +
                '}';
    }

    public Student(String id, String name, String lastname, HashMap<String, Integer> studmap) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.studmap = studmap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public HashMap<String, Integer> getStudmap() {
        return studmap;
    }

    public void setStudmap(HashMap<String, Integer> studmap) {
        this.studmap = studmap;
    }
}


package Task3;

import java.io.Serializable;

public class Student implements Serializable {
    protected static int IDcount;
    private String name;
    private int age;
    private int ID;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.ID = IDcount++;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}

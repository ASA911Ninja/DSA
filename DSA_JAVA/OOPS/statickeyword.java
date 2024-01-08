package OOPS;

public class statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Ais";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
}

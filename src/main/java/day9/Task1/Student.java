package day9.Task1;

public class Student extends Human {
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }

    public String getGroupName() {
        return groupName;
    }
}
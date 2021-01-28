package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Алиса", "юр26");
        Teacher teacher = new Teacher("Ирина Ивановна", "конституционное право");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();


    }
}

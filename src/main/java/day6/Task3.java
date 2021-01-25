package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Анна Сергеевна", "математика");
        Student student = new Student("Виктория");
        teacher.evaluate(student);
    }
}

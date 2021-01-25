package day6;

public class Teacher {
    private final String nameTeacher;
    private final String subject;

    public Teacher(String nameTeacher, String subject){
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }
    public void evaluate(Student n){
        int mark = (int) (Math.random()*4)+2;
        String litMark = String.valueOf(mark);
        switch (mark) {
            case 2:
                litMark = "неудовлетворительно";
                break;
            case 3:
                litMark = "удовлетворительно";
                break;
            case 4:
                litMark = "хорошо";
                break;
            case 5:
                litMark = "отлично";
                break;
        }
        System.out.println("Преподаватель "+nameTeacher+" оценила студента с именем "+n.getNameStudent()+" по предмету "+subject+" на оценку "  + litMark);
    }
}

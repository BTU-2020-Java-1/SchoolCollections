package ge.edu.btu.school;

public class Runner {

    public static void main(String[] args) {
        Student student = new Student(1, "Test Name");

        student.initJournal();

        student.addMark(Subject.MATH, 9);
        student.addMark(Subject.MATH, 9);
        student.addMark(Subject.MATH, 6);
        student.addMark(Subject.HISTORY, 3);
        student.addMark(Subject.HISTORY, 8);
        student.addMark(Subject.HISTORY, 6);
        student.addMark(Subject.HISTORY, 5);
        student.addMark(Subject.HISTORY, 7);

        student.printInfo();
    }
}

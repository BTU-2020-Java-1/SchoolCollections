package ge.edu.btu.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private int id;

    private String name;

    private Map<Subject, List<Integer>> journal = new HashMap<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void initJournal() {
        for (Subject subject : Subject.values()) {
            journal.put(subject, new ArrayList<>());
        }
    }

    public void addMark(Subject subject, int mark) {
        journal.get(subject).add(mark);
    }

    public void printInfo() {
        System.out.println("სტუდენტი: " + name);
        System.out.println("--------საშუალო ქულები--------");
        for (Subject subject : journal.keySet()) {
            List<Integer> marks = journal.get(subject);

            double sum = 0.0;
            for (int mark : marks) {
                sum = sum + mark;
            }

            double average = 0.0;
            if (!marks.isEmpty()) {
                average = sum / marks.size();
            }

            System.out.println(subject.name() + ": " + average);
        }
        System.out.println("--------------------------------");
    }
}

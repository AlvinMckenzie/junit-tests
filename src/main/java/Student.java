import java.util.ArrayList;

public class Student {
    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList grade) {
        this.id = id;
        this.name = name;
        this.grades = grade;
    }

    public long getId(){return this.id;}

    public String getName(){return this.name;}

    public void addGrade(int grade){grades.add(grade);}

    public ArrayList<Integer> getGrades(){return this.grades;}

    public double getGradeAverage(){
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };
}

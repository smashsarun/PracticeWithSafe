package student;

public class Student {

    private String name;
    private int studentid;
    private double scores;
    private char grades;
    private static int count = 0;

    public Student() {
        count++;
        this.studentid = 600 + count;
    }

    
    public Student(String name, double scores) {
        count++;
        this.name = name;
        this.studentid = 600 + count;
        this.scores = scores;

        if (scores >= 80) {
            grades = 'A';
        } else if (scores >= 70) {
            grades = 'B';
        } else if (scores >= 60) {
            grades = 'C';
        }
        else if (scores >= 50) {
            grades = 'D';
        }
        else {
            grades = 'F';
        }
    }


public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public char getGrades() {
        return grades;
    }

    public void setGrades(char grades) {
        this.grades = grades;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getStudentid() {
        return studentid;
    }

    @Override
        public String toString() {
        return "Student{" + "name=" + name + ", studentid=" + studentid + ", scores=" + scores + ", grades=" + grades + '}';
    }
    
    
    
}

import java.util.*;

public class Student {
    private String name;
    private String group;
    int course;
    private List<Double> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        OptionalDouble average = grades.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        return average.orElse(0.0);
    }

    public static void printStudents(Set<Student> students, int course) {
        if (students == null || students.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    /*@Override
    public String toString() {
        return "Студент{" +
                "Имя = '" + name + '\'' +
                ", Группа = '" + group + '\'' +
                ", Курс = " + course +
                ", Оценки = " + grades +
                ", avgGrade=" + String.format("%.2f", calculateAverageGrade()) +
                '}';
    }*/
}

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        //task 1
        List<Student> studentList = new ArrayList<>();
        List<Student> studentListNew = new ArrayList<>();

        Student student1 = new Student("Сережа", "47", 4);
        student1.addGrade(5);
        student1.addGrade(4);
        student1.addGrade(3);
        studentList.add(student1);

        Student student2 = new Student("Петя", "41", 1);
        student2.addGrade(4);
        student2.addGrade(2);
        student2.addGrade(2);
        studentList.add(student2);

        Student student3 = new Student("Миша", "49", 3);
        student3.addGrade(3);
        student3.addGrade(5);
        student3.addGrade(5);
        studentList.add(student3);

        Student student4 = new Student("Саша", "47", 4);
        student4.addGrade(5);
        student4.addGrade(2);
        student4.addGrade(3);
        studentList.add(student4);

        Student student5 = new Student("Ира", "47", 4);
        student5.addGrade(5);
        student5.addGrade(5);
        student5.addGrade(5);
        studentList.add(student5);

        System.out.println("--- Список студентов ---");
        for (Student student : studentList) {
            double averageGrade = student.calculateAverageGrade();
            System.out.println(student.getName() + ", Группа: " + student.getGroup() +
                    ", Курс: " + student.getCourse() +
                    ", Оценки: " + student.getGrades() +
                    ", Средний балл: " + String.format("%.2f", student.calculateAverageGrade()));
            if (averageGrade >= 3) {
                student.course = student.getCourse() + 1;
                studentListNew.add(student);
            }

        }
        studentList.clear();
        System.out.println("Количество записей в предыдущем массиве " + studentList.size());

        for (Student student : studentListNew) {
            System.out.println(student.getName() + ", Группа: " + student.getGroup() +
                    ", Курс: " + student.getCourse() +
                    ", Оценки: " + student.getGrades() +
                    ", Средний балл: " + String.format("%.2f", student.calculateAverageGrade()));
        }

        Set<Student> allStudents = new HashSet<>();
        for (Student student : studentListNew) {
            allStudents.add(student);
        }
        System.out.println("--- Список студентов ---");
        Student.printStudents(allStudents, 5);

        //task 2
        List<TelephoneDirectory> personalData = new ArrayList<>();
        TelephoneDirectory user1 = new TelephoneDirectory("Смирнов");
        user1.addTelephone("11-11-11");
        user1.addTelephone("22-22-22");
        personalData.add(user1);

        TelephoneDirectory user2 = new TelephoneDirectory("Иванов");
        user2.addTelephone("33-33-33");
        user2.addTelephone("44-33-33");
        personalData.add(user2);

        TelephoneDirectory user3 = new TelephoneDirectory("Смирнов");
        user3.addTelephone("55-22-22");
        user3.addTelephone("66-33-33");
        personalData.add(user3);

        TelephoneDirectory user4 = new TelephoneDirectory("Иванов");
        user4.addTelephone("77-22-66");
        user4.addTelephone("88-33-99");
        personalData.add(user4);

        System.out.println("--- Список телефонов ---");
        for (TelephoneDirectory subscriber : personalData) {
            System.out.println("Абонент{" +
                    "Фамилия = '" + subscriber.surname + '\'' +
                    ", Номера телефонов = '" + (subscriber.numbers) +
                    '}');
        }
        for (TelephoneDirectory subscriber : personalData) {
            if (subscriber.surname == "Иванов") {
                String listPhone = subscriber.getTelephone();
                System.out.println(listPhone);
            }
        }
    }
}

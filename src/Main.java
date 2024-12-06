import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "ali", 22));
        students.add(new Etudiant(2, "mohamed", 23));
        students.add(new Etudiant(3, "saleh", 21));

        sm.displayStudents(students, System.out::println);

        sm.displayStudentsByFilter(students, e -> e.getAge() > 80, System.out::println);

        String names = sm.returnStudentsNames(students, Etudiant::getNom);
        System.out.println(names);

        Etudiant newStudent = sm.createStudent(() -> new Etudiant(2, "mohamed", 23));
        System.out.println(newStudent);

        sm.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        students.forEach(System.out::println);

        sm.convertToStream(students).forEach(System.out::println);
    }
}

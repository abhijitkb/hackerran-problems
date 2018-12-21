package local.bando.ds.priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int total_entries = scanner.nextInt();

        List<String> events = new ArrayList<>(total_entries);
        while(total_entries-- > 0) {
            events.add(scanner.next());
        }

        final List<Student> students = Priorities.getStudents(events);
        students.forEach(System.out::println);
    }
}

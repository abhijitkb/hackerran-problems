package local.bando.ds.priorityqueue;

import java.util.*;

public final class Priorities {
    private static final String ENTER = "ENTER";
    private static final String SERVED = "SERVED";

    public static List<Student> getStudents(final List<String> events) {
        final Queue<Student> queue = new PriorityQueue<>((o1, o2) -> {
            // students having higher CPGA will have higher priority
            int diff = Double.compare(o2.getCGPA(), o1.getCGPA());
            if(diff == 0) {
                // rest all are priorities in ascending order
                diff = Objects.compare(o1.getName(), o2.getName(), String::compareTo);
                if(diff == 0)
                    diff = Integer.compare(o1.getID(), o2.getID());
            }

            return Integer.compare(diff, 0);
        });

        for(String event: events) {
            try(final Scanner scanner = new Scanner(event)) {
                String evt = scanner.next();

                switch (evt) {
                    case SERVED:
                        queue.poll();
                        break;
                    case ENTER:
                        String name = scanner.next();
                        double cgpa = scanner.nextDouble();
                        int id = scanner.nextInt();
                        queue.offer(new Student(id, name, cgpa));
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
        }

        final List<Student> students = new LinkedList<>();

        while(!queue.isEmpty())
            students.add(queue.poll());
        return students;
    }


}

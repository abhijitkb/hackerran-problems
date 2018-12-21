package local.bando.ds.priorityqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrioritiesTest {
    @Test
    void testSampleInput() {
        List<String> events = new ArrayList<>(12);
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED ");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");

        final List<Student> actualStudents = Priorities.getStudents(events);
        final List<String> actual = new ArrayList<>(12);
        actualStudents.forEach(student -> actual.add(student.getName()));
        final List<String> expected = Arrays.asList("Dan", "Ashley", "Shafaet", "Maria");
        Assertions.assertEquals(expected, actual);
    }
}
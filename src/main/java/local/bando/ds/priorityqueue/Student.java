package local.bando.ds.priorityqueue;

import java.util.Comparator;
import java.util.Objects;

public final class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cgpa, this.name, this.id);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;

        if(o instanceof Student) {
            Student other = (Student)o;
            if(Double.compare(other.cgpa, this.cgpa) == 0) {
                if(other.name.equals(this.name)) {
                    return Integer.compare(other.id, this.id) == 0;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%d %s %f", id, name, cgpa);
    }
}

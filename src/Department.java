import java.util.Arrays;
import java.util.Objects;

public class Department {

    private String name;
    private Student[] students;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    public Department(Student[] students) {
        this.students = students;
    }

    public Department(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) &&
                Arrays.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", number_of_students=" + (students==null?0:students.length) +
                '}';
    }
}

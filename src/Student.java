import java.util.Arrays;
import java.util.Objects;

public class Student extends Human{

    private Card card;
    private Department department;
    private History[] histories;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Student(String name, String surname, Card card, Department department, History[] histories) {
        super(name, surname);
        this.card = card;
        this.department = department;
        this.histories = histories;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public History[] getHistories() {
        return histories;
    }

    public void setHistories(History[] histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(card, student.card) &&
                Objects.equals(department, student.department) &&
                Arrays.equals(histories, student.histories);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), card, department);
        result = 31 * result + Arrays.hashCode(histories);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", surname=" + getSurname() +
                ", card=" + card +
                ", department=" + department +
                ", histories=" + Arrays.toString(histories) +
                '}';
    }
}
